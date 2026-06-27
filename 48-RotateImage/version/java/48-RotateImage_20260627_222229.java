// Last updated: 6/27/2026, 10:22:29 PM
class Solution {

    public void reverse(int[] arr, int n){
        int i = 0; 
        int j = n-1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public void rotate(int[][] matrix) {
        
        int n = matrix.length;

        // Transpose the matrix
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse the each row
        for(int i=0; i<n; i++){
            reverse(matrix[i], n);
        }
    }
} 

/*
    Clock-wise Rotation: 
        - First the Transpose.
        - Then reverse the each row (left to right)

    *   1 2 3        1 4 7        7 4 1
    *   4 5 6   =>   2 5 8   =>   8 5 2 
    *   7 8 9        3 6 9        9 6 3

    Anti-clock-wise Rotation: 
        - First Reverse the each row (left to right)
        - Then find the Transpose.
    
    *   1 2 3        3 2 1        3 6 9
    *   4 5 6   =>   6 5 4   =>   2 5 8 
    *   7 8 9        9 8 7        1 4 7
        

*/