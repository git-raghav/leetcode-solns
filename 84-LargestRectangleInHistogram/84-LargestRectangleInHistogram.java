// Last updated: 8/12/2025, 12:42:00 AM
class Solution {
    public int largestRectangleArea(int[] arr) {
        // initialization
        int maxarea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // next smaller right. trick is to write code for next greater right then modify it.
        Stack<Integer> stack = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) nsr[i] = arr.length; //agar nsl nahi h that means area last bar tak extend ho skta h isliye length use kari ki length-1 vala include hojaye
            else nsr[i] = stack.peek(); //we have to store index in the array and not the element itself
            stack.push(i);
        }

        // next smaller left
        stack = new Stack<>(); //empty the stack
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) nsl[i] = -1;
            else nsl[i] = stack.peek(); //we have to store index in the array and not the element itself
            stack.push(i);
        }

        // area calculate height * j-i-1 = height * nsr[i]-nsl[i]-1
        for(int i = 0; i < arr.length; i++){
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currarea = height * width;
            maxarea = Math.max(maxarea, currarea);
        }
        return maxarea;
    }
}