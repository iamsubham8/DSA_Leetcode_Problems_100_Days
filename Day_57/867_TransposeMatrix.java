
// Day – 57
// 867. Transpose Matrix
// Given a 2D integer array matrix, return the transpose of matrix.
// The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
// https://leetcode.com/problems/transpose-matrix/

 

class Solution {
    public int[][] transpose(int[][] matrix) {
     int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans ;   
    }
}


