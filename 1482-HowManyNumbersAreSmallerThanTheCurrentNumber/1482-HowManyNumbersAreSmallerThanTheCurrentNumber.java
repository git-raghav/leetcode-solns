// Last updated: 8/12/2025, 12:40:29 AM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int ctr=0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]<nums[i]){
                    ctr++;
                }
            }
            arr[i]=ctr;
        }
        return arr;
    }
}