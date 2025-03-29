// 287. Find the Duplicate Number
// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
// There is only one repeated number in nums, return this repeated number.
// You must solve the problem without modifying the array nums and using only constant extra space.
// https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
       int ans = 0 ;

       for(int i=0;i<nums.length;i++){
           int ele = nums[i];
           ele = Math.abs(ele);

           if(nums[ele]>0){
               nums[ele]=-nums[ele];
           }else{
               ans =  ele ;
               break;
           }
       }

       for(int i=0;i<nums.length;i++){
           nums[i]=Math.abs(nums[i]);
       }

       return ans ;  
    }
}


