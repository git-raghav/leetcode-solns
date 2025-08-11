// Last updated: 8/12/2025, 12:42:26 AM
class Solution {
    public int maxArea(int[] height) {
        int max= Integer.MIN_VALUE;
        int lp=0;
        int rp= height.length-1;

        while(lp<rp){
            int currWater= Math.min(height[lp], height[rp])*(rp-lp);
            max=Math.max(max, currWater);
            if(height[lp]<height[rp]){
                lp++;
            } else {
                rp--;
            }
        }
        return max;
    }
}