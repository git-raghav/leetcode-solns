// Last updated: 8/12/2025, 12:40:16 AM
class Solution {
    public int waysToSplitArray(int[] nums) {
        long left = 0;
        long sum = 0;
        int ctr = 0;
        if(nums.length<2) return 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        for(int i=0; i<nums.length-1; i++){
            left += nums[i];
            long right = sum - left;
            if(left>=right) ctr++;
        }
        return ctr;
    }
}