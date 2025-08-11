// Last updated: 8/12/2025, 12:42:11 AM
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int trapped = 0;
        if(n<=2) return 0;//edge case
        //sab element k liye left max, array m daalna h
        //leftmax= previous ka lmax and height of current ka max
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
        //right max
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        //calc trapped water
        //waterlevl = min of left and right
        //waterlvl-height
        for(int i=0; i<n; i++){
            trapped += Math.min(leftMax[i],rightMax[i])-height[i];
        }
        return trapped;
    }
}