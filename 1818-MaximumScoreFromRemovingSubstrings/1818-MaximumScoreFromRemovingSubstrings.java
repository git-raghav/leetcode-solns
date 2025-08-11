// Last updated: 8/12/2025, 12:40:25 AM
class Solution {
    public int maximumGain(String str, int x, int y) {
        int n = str.length();
        int score = 0;
        String maxstr, minstr;
        if (x > y) {
            maxstr = "ab";
            minstr = "ba";
        } else {
            maxstr = "ba";
            minstr = "ab";
        }

        // first pass for max value string
        String temp_first = removeSub(str, maxstr);
        int L = temp_first.length();
        int charRemoved = n - L;
        score += (charRemoved / 2) * Math.max(x, y);

        // second pass for min value string
        String temp_second = removeSub(temp_first, minstr);
        charRemoved = L - temp_second.length();
        score += (charRemoved / 2) * Math.min(x, y);

        return score;
    }

    public static String removeSub(String str, String matchstr) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (!stack.isEmpty() && str.charAt(i) == matchstr.charAt(1) && stack.peek() == matchstr.charAt(0)) {
                stack.pop();
            } else {
                stack.push(str.charAt(i));
            }
        }
        // converting remaining stack to string
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}