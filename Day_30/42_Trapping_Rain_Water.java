// Day - 30
// 42. Trapping Rain Water
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
// https://leetcode.com/problems/trapping-rain-water/

// Example 1:
 
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6

// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

// Example 2:
// Input: height = [4,2,0,3,2,5]
// Output: 9


class Solution {
    public int trap(int[] height) {
        int n = height.length;

        int[] leftMax = new int[n];
        leftMax[0] = height[0];

        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }
      int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];

        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }

        int sum = 0;

        for(int i=0;i<n;i++){
            sum += Math.min(leftMax[i],rightMax[i])-height[i];
        }
        return sum;
    }
}
