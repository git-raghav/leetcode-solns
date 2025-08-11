// Last updated: 8/12/2025, 12:41:02 AM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int nxtGreater[] = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = nums2.length - 1; i >= 0; i--) {
            //step1
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
                stack.pop();
            }
            //step2
            if (stack.isEmpty()) map.put(nums2[i], -1);
            else map.put(nums2[i], stack.peek());
            //step3
            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            nxtGreater[i] = map.get(nums1[i]);
        }
        return nxtGreater;
    }
}