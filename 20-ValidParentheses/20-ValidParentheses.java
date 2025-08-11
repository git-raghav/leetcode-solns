// Last updated: 8/12/2025, 12:42:19 AM
class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            //if current element is a opening bracket
            if(ch == '(') stack.push(')');
            else if(ch == '{') stack.push('}');
            else if(ch == '[') stack.push(']');

            //if there were no openeing bracket so stack is empty or current element is closing bracket
            else if(stack.isEmpty() || ch != stack.pop()) return false;
        }
        return stack.isEmpty();
    }
}