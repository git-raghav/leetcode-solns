// Last updated: 8/12/2025, 12:40:38 AM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int lp = 0;
        int rp = n - 1;
        int result[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[lp]) > Math.abs(nums[rp])) {
                result[i] = nums[lp] * nums[lp];
                lp++;
            } else {
                result[i] = nums[rp] * nums[rp];
                rp--;
            }
        }
        return result;
    }
}