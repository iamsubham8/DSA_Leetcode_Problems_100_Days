// Day – 33
// 2529. Maximum Count of Positive Integer and Negative Integer
// Given an array nums sorted in non-decreasing order, return the maximum between the number of positive integers and the number of negative integers.
// •	In other words, if the number of positive integers in nums is pos and the number of negative integers is neg, then return the maximum of pos and neg.
// Note that 0 is neither positive nor negative.
// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
class Solution {
    public int maximumCount(int[] nums) {
        int lastnegIndex= lastNegative(nums) +1 ;
        int firtposIndex = nums.length - firstPositive(nums);
        return Math.max(lastnegIndex , firtposIndex);
    }

    public int lastNegative(int[] nums){
        int start = 0 ;
        int end = nums.length-1 ;
        int ans = -1 ;

        while(start<=end){
            int mid = (start + end)/2;
            if(nums[mid]<0){
                ans = mid ;
                start = mid+1 ;
            }else{
                end = mid-1 ;
            }
        }

        return ans ;
    }


    public int firstPositive(int[] nums){
        int start = 0 ;
        int end = nums.length-1;
        int ans = nums.length;

        while(start<=end){
            int mid = (start + end )/2;
            if(nums[mid]>0){
                ans=mid;
                end=mid-1;
            }else{
                start = mid+1 ;
            }
        }

        return ans ;
    }
}

