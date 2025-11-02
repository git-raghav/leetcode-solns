// Last updated: 11/2/2025, 9:27:52 AM
import java.util.*;

public class Solution {
    // Driver will call this
    public String lexPalindromicPermutation(String s, String target) {
        return smallestPalPermGreater(s, target);
    }

    // Your original method (kept as-is)
    private String smallestPalPermGreater(String s, String target) {
        int n = s.length();
        if (target.length() != n) return "";
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        // Check palindromic-permutation feasibility and find center (if any)
        int oddCnt = 0, centerIdx = -1;
        for (int i = 0; i < 26; i++) {
            if ((freq[i] & 1) == 1) { oddCnt++; centerIdx = i; }
        }
        if ((n % 2 == 0 && oddCnt != 0) || (n % 2 == 1 && oddCnt != 1)) return "";

        int half = n / 2;
        int[] need = new int[26];
        for (int i = 0; i < 26; i++) need[i] = freq[i] / 2;
        char center = (n % 2 == 1) ? (char) ('a' + centerIdx) : 0;

        char[] tgt = target.toCharArray();
        char[] left = new char[half];

        // DFS with pruning: try to keep tight==true (equal to target) as long as possible.
        if (dfs(0, true, need, left, tgt, center)) {
            return assemble(left, center, n);
        }
        return "";
    }

    // Returns true if it found a valid answer and left[] contains it.
    private boolean dfs(int pos, boolean tight, int[] need, char[] left, char[] tgt, char center) {
        int n = tgt.length, half = left.length;
        if (pos == half) {
            // Left is fixed; check the full palindrome > target
            return isPalGreater(left, center, tgt);
        }

        if (tight) {
            int eq = tgt[pos] - 'a';

            // 1) Try equal letter if available
            if (need[eq] > 0) {
                need[eq]--; left[pos] = (char) (eq + 'a');
                if (dfs(pos + 1, true, need, left, tgt, center)) return true;
                need[eq]++; // backtrack
            }

            // 2) Try the smallest letter strictly greater than target[pos], then greedy finish
            for (int c = eq + 1; c < 26; c++) {
                if (need[c] == 0) continue;
                // choose c here
                int[] needCopy = need.clone();
                char[] leftCopy = left.clone();
                needCopy[c]--; leftCopy[pos] = (char) (c + 'a');
                greedyFill(leftCopy, pos + 1, needCopy);
                if (isPalGreater(leftCopy, center, tgt)) {
                    // copy back result
                    System.arraycopy(leftCopy, 0, left, 0, half);
                    return true;
                }
            }
            return false;
        } else {
            // Already greater earlier: just finish greedily with smallest letters
            int[] needCopy = need.clone();
            char[] leftCopy = left.clone();
            greedyFill(leftCopy, pos, needCopy);
            if (isPalGreater(leftCopy, center, tgt)) {
                System.arraycopy(leftCopy, 0, left, 0, half);
                return true;
            }
            return false; // should not happen if counts are consistent
        }
    }

    // Fill remaining left positions with smallest possible letters
    private void greedyFill(char[] left, int start, int[] need) {
        int p = start;
        for (int c = 0; c < 26; c++) {
            while (need[c] > 0) {
                left[p++] = (char) (c + 'a');
                need[c]--;
            }
        }
    }

    // Compare assembled palindrome with target, check strictly greater
    private boolean isPalGreater(char[] left, char center, char[] tgt) {
        int n = tgt.length, half = left.length;
        for (int i = 0; i < n; i++) {
            char pc;
            if (i < half) pc = left[i];
            else if (n % 2 == 1 && i == half) pc = center;
            else pc = left[n - 1 - i]; // mirror
            if (pc != tgt[i]) return pc > tgt[i];
        }
        return false; // equal => not strictly greater
    }

    private String assemble(char[] left, char center, int n) {
        StringBuilder sb = new StringBuilder(n);
        sb.append(left);
        if (n % 2 == 1) sb.append(center);
        for (int i = left.length - 1; i >= 0; i--) sb.append(left[i]);
        return sb.toString();
    }
}
