// Last updated: 8/12/2025, 12:42:27 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //target = x+y, x = target-y
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target-nums[i];
            if(numToIndex.containsKey(complement)){
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[]{-1, -1}; // No solution found
    }
}
