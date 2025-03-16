// Day - 24
// 153. Find Minimum in Rotated Sorted Array
// Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
// •	[4,5,6,7,0,1,2] if it was rotated 4 times.
// •	[0,1,2,4,5,6,7] if it was rotated 7 times.
// Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
// Given the sorted rotated array nums of unique elements, return the minimum element of this array.
// You must write an algorithm that runs in O(log n) time.
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

class Solution {
    public int findMin(int[] nums) {
       public int findMin(int[] nums) {
       if(nums.length==1){
           return nums[0];
       }else if ( nums[0]<nums[nums.length-1]){
           return nums[0];
       }

       int start = 0 ;
       int end = nums.length-1 ;

       while(start<=end){
           int mid = (start + end )/2;

           if(mid!=0 && nums[mid-1]>nums[mid]){
               return nums[mid];
           }else if( mid!=nums.length-1 && nums[mid]>nums[mid+1] ){
               return nums[mid+1];
           }else if(nums[start]<=nums[mid]){ // left part is sorted
             start = mid+1 ;
           }else{ // right part is sorted ;
                end = mid-1 ;
           }
       }
       return -1 ;  
    }
}
}