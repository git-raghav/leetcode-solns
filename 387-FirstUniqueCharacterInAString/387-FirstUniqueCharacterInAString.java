// Last updated: 8/12/2025, 12:41:08 AM
import java.util.*;
class Solution {
    //approach 1
    public int app1(String str) {
        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch - 'a'] == 1) return i;
        }
        return -1;
    }

    //approach 2
    public int firstUniqChar(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.remove();
            }
        }
        return q.isEmpty()? -1 : str.indexOf(q.peek());
    }
}