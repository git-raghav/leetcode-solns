// Last updated: 8/12/2025, 12:41:34 AM
class Solution {
    public int majorityElement(int[] nums) {
        //bayer-moore voting algo
        int count = 0;
        int candidate = 0;

        for(int i = 0; i < nums.length; i++){
            if(count == 0) candidate = nums[i]; // jab bhi count 0 hoga tab candidate badal dena h
            if (candidate == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}