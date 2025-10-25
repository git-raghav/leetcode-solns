// Last updated: 10/26/2025, 12:14:57 AM
class Solution {
    public long minOperations(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int target = nums2[n];
        long ans = 0L;
        long bestDist = Long.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int left = nums1[i], right = nums2[i];
            int low = Math.min(left, right), high = Math.max(left, right);

            ans += Math.abs((long)left - right);//cost for transformation of nums1 elements

            long dist = Math.min(1+Math.abs((long)left-target), 1+Math.abs((long)right-target));//append cost if not b/w transformation

            if (low <= target && target <= high) dist = 1L;//append cost if b/w transformation

            bestDist = Math.min(bestDist, dist);// best append cost
        }

        return ans + bestDist;
    }
}