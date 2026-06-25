// Last updated: 6/26/2026, 12:06:59 AM
class Solution {
    public long maxProduct(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        
        long product = 0L;
        int n = nums.length;
        
        product = 100000L * nums[n-1] * nums[n-2];
        return product;
    }
}