// Last updated: 11/8/2025, 8:45:58 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;

        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = (nums[i] >= nums[i - 1]) ? left[i - 1] + 1 : 1;
        }

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            right[i] = (nums[i] <= nums[i + 1]) ? right[i + 1] + 1 : 1;
        }

        int ans = 1;
        for (int i = 0; i < n; i++) ans = Math.max(ans, left[i]);

        for (int i = 0; i < n; i++) {
            int leftLen = (i > 0) ? left[i - 1] : 0;
            int rightLen = (i < n - 1) ? right[i + 1] : 0;

            if (i > 0 && i < n - 1 && nums[i - 1] <= nums[i + 1]) {
                ans = Math.max(ans, leftLen + 1 + rightLen);
            } else {
                ans = Math.max(ans, Math.max(leftLen + 1, rightLen + 1));
            }
        }

        return Math.min(ans, n);
    }
}