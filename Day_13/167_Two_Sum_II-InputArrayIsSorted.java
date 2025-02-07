// 167. Two Sum II - Input Array Is Sorted
// Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
// Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
// The tests are generated such that there is exactly one solution. You may not use the same element twice.
// Your solution must use only constant extra space.

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        int start = 0 ;
        int end = numbers.length-1 ;

        while(start<end){
            int sum = numbers[start] + numbers[end];

            if(sum == target){
                ans[0] = start+1 ;
                ans[1] = end+1 ;

                return ans ;
            }else if ( sum > target){
                end--;
            }else{
                start++;
            }
        }

        //Other solution.........................
        
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=0;j<numbers.length;j++){
        //         int sum = numbers[i] + numbers[j];
        //         if(sum == target){
        //             ans[0] = i+1;
        //             ans[1] = j+1;
        //             return ans;
        //         }
        //     }
           
        // }

        return ans;
    }
}