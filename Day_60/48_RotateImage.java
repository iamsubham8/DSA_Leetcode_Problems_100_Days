// 48. Rotate Image
// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
// https://leetcode.com/problems/rotate-image/
 

 class Solution {
    public void rotate(int[][] matrix) {
         int n = matrix.length;
       for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
               int k = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = k ;
           }
       }

       for(int i=0;i<matrix.length;i++){
           int[] tempArr = matrix[i];
           reverse(tempArr);
       }
       return ;
    }

    public void reverse(int[] arr ){
        int start = 0 ;
        int end = arr.length-1 ;
        while(start<=end){
            int k = arr[start];
            arr[start] = arr[end];
            arr[end] = k ;

            start++ ;
            end--;
        }
    }
}

