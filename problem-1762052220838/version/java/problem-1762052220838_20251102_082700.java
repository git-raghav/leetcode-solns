// Last updated: 11/2/2025, 8:27:00 AM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i - 1];
            int curr = nums[i];

            for (int val = prev + 1; val < curr; val++) {
                ans.add(val);
            }
        }
        return ans;
    }
}
