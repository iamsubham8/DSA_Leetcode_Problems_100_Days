// 215. Kth Largest Element in an Array
// Given an integer array nums and an integer k, return the kth largest element in the array.
// Note that it is the kth largest element in the sorted order, not the kth distinct element.
// Can you solve it without sorting?

// https://leetcode.com/problems/kth-largest-element-in-an-array/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

       for(int i=0;i<nums.length;i++){

           if(pq.size()<k){
               pq.add(nums[i]);
           }else if ( pq.peek()<nums[i]){
               pq.remove();
               pq.add(nums[i]);
           }
       }   

       return pq.peek();
    }
}

