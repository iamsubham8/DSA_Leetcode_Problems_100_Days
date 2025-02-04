// 268. Missing Number
// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
// https://leetcode.com/problems/missing-number/
// https://leetcode.com/problems/missing-number/

class Solution {
    public int missingNumber(int[] nums) {
       int range = nums.length;

        int actualSum = (range*(range+1))/2;   //n(n+1)/2
        int currentSum = 0;

        for(int i=0;i<nums.length;i++){
            currentSum = currentSum + nums[i];
        }

        int ans = actualSum - currentSum;

        return ans;

    }
}
