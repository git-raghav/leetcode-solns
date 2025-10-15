// Last updated: 10/15/2025, 6:04:54 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;

        while(j < nums.length){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return i+1;
    }
}