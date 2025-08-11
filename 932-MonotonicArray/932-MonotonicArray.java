// Last updated: 8/12/2025, 12:40:45 AM
class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]) {
                inc = false;
            }
            if (nums[i] < nums[i+1]) {
                dec = false;
            }
            if(inc == false && dec == false) return false;
        }
        return inc || dec;
    }
}