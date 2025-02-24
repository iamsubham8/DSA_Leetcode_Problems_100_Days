// 1394. Find Lucky Integer in an Array
// Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
// Return the largest lucky integer in the array. If there is no lucky integer return -1.
// https://leetcode.com/problems/find-lucky-integer-in-an-array/ 

class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501]; // Given constraints (assuming values in arr are 1 to 500)

        // Count occurrences
        for (int num : arr) {
            freq[num]++;
        }

        int ans = -1;
        // Check for lucky numbers
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] == i) {
                ans = i; // Keep the maximum lucky number
            }
        }

        return ans;
    }
}


