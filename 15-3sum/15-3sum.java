// Last updated: 8/12/2025, 12:42:22 AM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> mainlist = new ArrayList<>();
        Arrays.sort(nums);
        int size = nums.length;

        for(int i=0; i<nums.length-2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int j=i+1;
            int k=size-1;
            while(j<k){
                int total = nums[i]+nums[j]+nums[k];
                if(total==0){
                    mainlist.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
                else if(total<0) j++;
                else k--;
            }
        }
        return mainlist;
    }
}