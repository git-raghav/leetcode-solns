// Last updated: 8/12/2025, 12:41:06 AM
class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ']') { // Push characters into the stack until ']' is encountered
                stack.push(s.charAt(i));
            } else {
                //maal ikhatta karo[..]
                StringBuilder temp = new StringBuilder();
                while(!stack.isEmpty() && stack.peek() != '['){
                    temp.insert(0, stack.pop());
                }
                stack.pop();

                //ab number aega unhe ikhatta krlo
                StringBuilder num = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    num.insert(0, stack.pop());
                }
                int number = Integer.parseInt(num.toString());//char num -> string -> int

                //ab expand karo or vapis stack m push krdo
                StringBuilder repeat = new StringBuilder();
                for (int j = 0; j < number; j++) repeat.append(temp);
                for (char c : repeat.toString().toCharArray()) stack.push(c);
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.insert(0, stack.pop());
        }
        return res.toString();
    }
}