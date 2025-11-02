// Last updated: 11/2/2025, 8:53:08 AM
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