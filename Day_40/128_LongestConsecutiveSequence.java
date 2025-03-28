// 128. Longest Consecutive Sequence
// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
// You must write an algorithm that runs in O(n) time.
// https://leetcode.com/problems/longest-consecutive-sequence/

class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],false);
        }

        for(int key : hm.keySet()){
            if(hm.containsKey(key-1)==false){
                hm.put(key,true);
            }
        }
        int max = 0 ;
        for(int key : hm.keySet()){
            int k=1 ;
            if(hm.get(key)==true){
                while(hm.containsKey(key+k)==true){
                    k++;
                }
            }
            max = Math.max(max,k);
        }
        return max ;
    }
}

