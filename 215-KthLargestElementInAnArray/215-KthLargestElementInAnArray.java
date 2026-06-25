// Last updated: 6/26/2026, 12:08:00 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++){
            min.add(nums[i]);
            if(min.size() > k){
                min.poll();
            }
        }
        return min.poll();
    }
}