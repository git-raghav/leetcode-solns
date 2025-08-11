// Last updated: 8/12/2025, 12:42:06 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int flag = 0;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                flag++;
                break;
            }
            if(nums[i] > largest) largest = nums[i];
        }
        if(flag > 0) {
            int currsum = 0;
            int maxsum = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                currsum += nums[i];
                if(currsum < 0) currsum = 0;
                maxsum = Math.max(maxsum, currsum);
            }
            return maxsum;
        } else {
            return largest;
        }
    }
}