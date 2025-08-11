// Last updated: 8/12/2025, 12:40:26 AM
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int maxsum = 0, currentSum = 0, start = 0;
        boolean[] isPresent = new boolean[10001];

        for (int end = 0; end < nums.length; end++) {
            while (isPresent[nums[end]]) {
                isPresent[nums[start]] = false;
                currentSum -= nums[start];
                start++;
            }

            isPresent[nums[end]] = true;
            currentSum += nums[end];

            maxsum = Math.max(maxsum, currentSum);
        }
        return maxsum;
    }
}