// Last updated: 10/26/2025, 8:53:52 AM
import java.util.Arrays;
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long ans = 0L;
        
        for(int i = 0; i < n; i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);

        int k = (n + 1) / 2; //no. of biggest no.s
        for(int i = 0; i < n; i++){
            long sq = (long)nums[i] * nums[i];
            if(i >= n-k){
                ans += sq;
            } else {
                ans -= sq;
            }
        }
        return ans;
    }
}