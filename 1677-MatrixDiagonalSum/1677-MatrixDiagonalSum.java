// Last updated: 8/12/2025, 12:40:28 AM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0; i<mat.length; i++){
            //primary diagonal
            sum += mat[i][i];
            //seconadary diagonal
            if(i != mat.length-1-i) sum += mat[i][mat.length-1-i];
        }
        return sum;
    }
}