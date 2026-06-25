// Last updated: 6/26/2026, 12:07:02 AM
class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        int moves = 0;
        for(int i = 0; i < nums.length; i++){
            moves += (max-nums[i]);
        }
        return moves;
    }
}