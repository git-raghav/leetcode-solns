// Last updated: 6/25/2026, 2:27:03 PM
1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4        int trappedWater = 0;
5        //edge case
6        if(n <= 2) return 0;
7        //leftmax boundary
8        int leftmax[] = new int[n];
9        leftmax[0] = height[0];
10        for(int i = 1; i < n; i++){
11            leftmax[i] = Math.max(leftmax[i-1], height[i]);
12        }
13        //rightmax boundary
14        int rightmax[] = new int[n];
15        rightmax[n-1] = height[n-1];
16        for(int i = n-2; i >= 0; i--){
17            rightmax[i] = Math.max(rightmax[i+1], height[i]);
18        }
19        //trapped water
20        for(int i = 0; i < n; i++){
21            int waterlvl = Math.min(leftmax[i], rightmax[i]);
22            trappedWater += waterlvl-height[i];
23        }
24        return trappedWater;
25    }
26}