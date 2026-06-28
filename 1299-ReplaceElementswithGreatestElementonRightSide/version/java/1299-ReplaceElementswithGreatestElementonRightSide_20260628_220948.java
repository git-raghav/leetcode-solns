// Last updated: 6/28/2026, 10:09:48 PM
1class Solution {
2    public int[] replaceElements(int[] arr) {
3        int max = -1;
4        for(int i = arr.length-1; i >= 0; i--){
5            int num = arr[i];
6            arr[i] = max;
7            max = Math.max(max, num);
8        }
9        return arr;
10    }
11}