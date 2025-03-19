// 540. Single Element in a Sorted Array
// You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
// Return the single element that appears only once.
// Your solution must run in O(log n) time and O(1) space.


class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        else if ( nums[0]!=nums[1]){
            return nums[0];
        }
        else if ( nums[nums.length-1] != nums[nums.length-2]){
            return nums[nums.length-1];
        }

        int start = 0 ;
        int end = nums.length-1 ;
        while(start<=end){
            int mid = (start + end)/2;

            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
                return nums[mid];
            }else if ( mid % 2 ==1 ){ // if mid index is odd

                if(nums[mid-1]==nums[mid]){
                    start = mid+1 ;
                }else{
                    end = mid-1 ;
                }
            }else { // if mid index is even
                    if(nums[mid]==nums[mid+1]){
                        start = mid +1 ;
                    }else{
                        end = mid -1 ;
                    }
            }
        }

        return -1 ;
        }
}
