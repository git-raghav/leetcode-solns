// Last updated: 8/12/2025, 12:40:22 AM
class Solution {
    public List<Integer> findLonely(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int length = nums.length;

        //checking edge case
        if(length == 1){
            ans.add(nums[0]);
            return ans;
        }

        //first element
        if(nums[0] != nums[1] && nums[0] != nums[1]-1) ans.add(nums[0]);

        //middle element
        for(int i=1; i<length-1; i++){
            if((nums[i-1] != nums[i] && nums[i] != nums[i+1]) && (nums[i-1]+1 != nums[i] && nums[i] != nums[i+1]-1)) ans.add(nums[i]);
        }

        //last element
        if(nums[length-1] != nums[length-2] && nums[length-1] != nums[length-2]+1) ans.add(nums[length-1]);

        return ans;
    }
}