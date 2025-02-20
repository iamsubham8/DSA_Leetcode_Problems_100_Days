// 1800. Maximum Ascending Subarray Sum
// Given an array of positive integers nums, return the maximum possible sum of an ascending subarray in nums.
// A subarray is defined as a contiguous sequence of numbers in an array.
// A subarray [numsl, numsl+1, ..., numsr-1, numsr] is ascending if for all i where l <= i < r, numsi < numsi+1.
//  Note that a subarray of size 1 is ascending.

// https://leetcode.com/problems/maximum-ascending-subarray-sum/

class Solution {
    public int maxAscendingSum(int[] nums) {
         int max = nums[0];
        int currmax = nums[0];

        for(int i=1 ; i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                currmax = currmax + nums[i];
            }else {
                max = Math.max(max , currmax);
                currmax = nums[i];
            }
        }
         max = Math.max(max , currmax);
         return max ;
    }
}
