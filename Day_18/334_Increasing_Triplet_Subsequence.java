// 334. Increasing Triplet Subsequence
// Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
// https://leetcode.com/problems/increasing-triplet-subsequence/

class Solution {
    public boolean increasingTriplet(int[] nums) {
       int first = Integer.MAX_VALUE ;
       int second = Integer.MAX_VALUE ;
       int third = Integer.MAX_VALUE ;

       for(int i=0;i<nums.length;i++){

           int element= nums[i];
           if(first>=element){
               first = element ;
           }else if ( second >= element){
               second = element ;
           }else {
               third = element ;
               return true ;
           }
       }
       return false ;
    }
}
 