// Last updated: 6/25/2026, 5:35:39 PM
1class Solution {
2    public int maximumUniqueSubarray(int[] nums) {
3        int maxsum = 0, currsum = 0, start = 0;
4        boolean isPresent[] = new boolean[10001];
5        for(int end = 0; end < nums.length; end++){
6            while(isPresent[nums[end]]){
7                isPresent[nums[start]] = false;
8                currsum -= nums[start];
9                start++;
10            }
11            isPresent[nums[end]] = true;
12            currsum += nums[end];
13
14            maxsum = Math.max(maxsum, currsum);
15        }
16        return maxsum;
17    }
18}