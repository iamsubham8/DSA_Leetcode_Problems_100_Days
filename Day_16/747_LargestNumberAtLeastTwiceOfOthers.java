// 747. Largest Number At Least Twice of Others
// You are given an integer array nums where the largest integer is unique.

// Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.
// https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/

class Solution {
    public int dominantIndex(int[] nums) {
        int max = -1 ;
        int smax = -1 ;
        int maxIdx = 0 ;

        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                smax=max ;
                max = nums[i];
                maxIdx = i ;
            }else if ( smax < nums[i]){
                smax = nums[i];
            }
            
        }

        if(smax*2<=max){
            return maxIdx;
        }else{
            return -1 ;
        }
    }
}