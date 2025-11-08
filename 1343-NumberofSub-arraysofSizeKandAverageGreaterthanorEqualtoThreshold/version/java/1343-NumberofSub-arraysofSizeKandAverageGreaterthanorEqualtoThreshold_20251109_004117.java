// Last updated: 11/9/2025, 12:41:17 AM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int result = 0;
        while(j < arr.length){
            int ws = j-i+1;
            sum += arr[j];
            if(ws == k){
                if(sum/k >= threshold) result++;
                sum -= arr[i];
                i++;
            }
            j++;
        }
        return result;
    }
}