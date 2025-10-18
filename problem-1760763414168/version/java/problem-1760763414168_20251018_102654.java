// Last updated: 10/18/2025, 10:26:54 AM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // in case k is greater than n
        if (n > 1 && k > 0) {
            reverse(nums, 0, n - 1); // step 1 complete array reverse
            reverse(nums, 0, k - 1); // step 2 first k elements reverse
            reverse(nums, k, n - 1); // step 3 remaining elements reverse except 1st k
        }
    }

    private void reverse(int[] nums, int lp, int rp) {
        while (lp < rp) {
            int temp = 0;
            temp = nums[lp];
            nums[lp] = nums[rp];
            nums[rp] = temp;
            lp++;
            rp--;
        }
    }
}