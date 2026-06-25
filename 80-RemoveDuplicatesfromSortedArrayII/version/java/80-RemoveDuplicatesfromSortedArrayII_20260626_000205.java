// Last updated: 6/26/2026, 12:02:05 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        //target = x+y, x = target-y
4        HashMap<Integer, Integer> numToIndex = new HashMap<>();
5        for(int i = 0; i < nums.length; i++){
6            int complement = target-nums[i];
7            if(numToIndex.containsKey(complement)){
8                return new int[]{numToIndex.get(complement), i};
9            }
10            numToIndex.put(nums[i], i);
11        }
12        return new int[]{-1, -1}; // No solution found
13    }
14}