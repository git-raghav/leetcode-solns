// Last updated: 10/22/2025, 9:54:55 PM
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // in case k is greater than n
        reverse(nums, 0, n - 1); // step 1 complete array reverse
        reverse(nums, 0, k - 1); // step 2 first k elements reverse
        reverse(nums, k, n - 1); // step 3 remaining elements reverse except 1st k
    }

    private void reverse(int[] nums, int lp, int rp) {
        while (lp < rp) {
            int temp = nums[lp];
            nums[lp] = nums[rp];
            nums[rp] = temp;
            lp++;
            rp--;
        }
    }
}