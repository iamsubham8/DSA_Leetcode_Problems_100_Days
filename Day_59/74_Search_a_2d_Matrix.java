// Day – 59
// 74. Search a 2D Matrix
// You are given an m x n integer matrix matrix with the following two properties:
// •	Each row is sorted in non-decreasing order.
// •	The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.
// You must write a solution in O(log(m * n)) time complexity.

// https://leetcode.com/problems/search-a-2d-matrix/https://leetcode.com/problems/search-a-2d-matrix/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0 ;
        int col = matrix[0].length -1 ;

        while(row<matrix.length && col>=0){
            if(matrix[row][col] == target){
                return true ;
            }else if ( matrix[row][col]>target){
                col--;
            }else{
                row++;
            }
        }

        return false;
    }
}
