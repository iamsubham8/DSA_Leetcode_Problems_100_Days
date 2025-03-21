// 53. Maximum Subarray
// Given an integer array nums, find the subarray with the largest sum, and return its sum.
// https://leetcode.com/problems/maximum-subarray/
class Solution {
    public int maxSubArray(int[] nums) {
          int currsum = nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++){

            if(currsum + nums[i] > nums[i]){
                currsum+=nums[i];
            }else{
                currsum = nums[i];
            }

            max = Math.max(max , currsum);
        }
        return max ;
    }
}

