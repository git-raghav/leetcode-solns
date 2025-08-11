// Last updated: 8/12/2025, 12:40:50 AM
class Solution {
    public int longestMountain(int[] arr) {
        if(arr.length<3) return 0;
        int longest = 0;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                int lp=i-1;
                int rp=i+1;
                while(lp>0 && arr[lp-1]<arr[lp]) lp--;
                while(rp<arr.length-1 && arr[rp+1]<arr[rp]) rp++;
                longest = Math.max(longest,(rp-lp)+1);
            }
        }
        return longest;
    }
}