// 75. Sort Colors
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// You must solve this problem without using the library's sort function.
// https://leetcode.com/problems/sort-colors/

class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length-1;

        //dutch flag algoritm ( red, white, and blue.)
        while(mid<=end){
            if(nums[mid] == 0){
                swap(nums,start,mid);
                start++;
                mid++;
            }  else if(nums[mid] == 1){
                mid++;
            }  else{
                swap(nums,end,mid);
                end--;
            }
        }
    }
    public void swap(int []nums , int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
