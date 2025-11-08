// Last updated: 11/9/2025, 3:33:15 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> b - a);
        for(int n: nums){
            q.add(n);
        }
        while(k>1){
            q.poll();
            k--;
        }
        return q.poll();
    }
}