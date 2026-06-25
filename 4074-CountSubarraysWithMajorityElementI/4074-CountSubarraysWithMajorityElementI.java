// Last updated: 6/26/2026, 12:07:05 AM
class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                arr[i] = 1;
            } else {
                arr[i] = -1;
            }
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > 0) count++;
            }
        }
        return count;
    }
}