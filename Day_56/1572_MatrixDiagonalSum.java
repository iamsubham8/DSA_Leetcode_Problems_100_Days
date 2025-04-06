// Day – 56
// 1572. Matrix Diagonal Sum
// Given a square matrix mat, return the sum of the matrix diagonals.
// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

// https://leetcode.com/problems/matrix-diagonal-sum/

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0 ;
       int n = mat.length;

       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
               if(i==j || i+j == n-1){
                   sum += mat[i][j];
               }
           }
       }
       return sum ;

    }
}

