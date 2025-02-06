// 977. Squares of a Sorted Array
// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
// Squaring each element and sorting the new array is very trivial, could you find an O(n) solution using a different approach?
// https://leetcode.com/problems/squares-of-a-sorted-array/
class Solution {
        public int[] sortedSquares(int[] nums) {
                int[] ans = new int[nums.length];
                int start = 0;
                int end = nums.length - 1;
                int ptr = ans.length - 1;
                while (start <= end) {

                        int sSquare = nums[start] * nums[start]; // start square = sSquare
                        int eSquare = nums[end] * nums[end]; // end square = eSquare

                        if (sSquare > eSquare) {
                                ans[ptr] = sSquare;
                                start++;
                        } else {
                                ans[ptr] = eSquare;
                                end--;
                        }
                        ptr--;
                }
                return ans;
        }
}
