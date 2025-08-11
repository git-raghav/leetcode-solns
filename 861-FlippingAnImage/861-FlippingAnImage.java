// Last updated: 8/12/2025, 12:40:52 AM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int[] row : image){
            reverseRow(row);
            invertRow(row);
        }
        return image;
    }
    public static void reverseRow(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void invertRow(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                arr[i] = 1;
            }
            else{
                arr[i] = 0;
            }
        }
    }
}