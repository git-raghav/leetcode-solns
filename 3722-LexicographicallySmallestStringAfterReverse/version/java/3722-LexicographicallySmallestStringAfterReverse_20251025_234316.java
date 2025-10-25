// Last updated: 10/25/2025, 11:43:16 PM
class Solution {
    public long minOperations(int[] nums1, int[] nums2) {
        int n = nums1.length;
        long base = 0L;

        for(int i = 0; i < n; i++){
            base += Math.abs((long)nums1[i] - nums2[i]);
        }

        int target = nums2[n];
        long bestDist = Long.MAX_VALUE;
        boolean middle = false;

        for(int i = 0; i < nums1.length; i++){
            int left = nums1[i], right = nums2[i];
            int low = Math.min(left, right), high = Math.max(left, right);

            if (low <= target && target <= high) {
                middle = true;
                break;
            } else if (target < low) {
                bestDist = Math.min(bestDist, (long)low - target);
            } else { // target > hi
                bestDist = Math.min(bestDist, (long)target - high);
            }
        }

        if(middle) {
            return base + 1L; 
        } else {
            return base + 1L + bestDist;
        }
    }
}