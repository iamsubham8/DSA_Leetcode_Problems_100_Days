// Day – 31
// 2089. Find Target Indices After Sorting Array
// You are given a 0-indexed integer array nums and a target element target.
// A target index is an index i such that nums[i] == target.
// Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.
// https://leetcode.com/problems/find-target-indices-after-sorting-array/


class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
       int num = 0;
       int count = 0;

        for(int element:nums){
            if(element == target){
                count++;
            }else if(element < target){
                num++;
            }
        } 
        List<Integer> ans = new ArrayList<>();
        while(count>0){
            ans.add(num);
            num++;
            count--;
        }
        return ans;
    }
}


