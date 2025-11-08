// Last updated: 11/8/2025, 11:38:10 PM
class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;
        for(int i = arr.length-1; i >= 0; i--){
            int num = arr[i];
            arr[i] = max;
            max = Math.max(max, num);
        }
        return arr;
    }
}