// 1046. Last Stone Weight
// You are given an array of integers stones where stones[i] is the weight of the ith stone.
// We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
// •	If x == y, both stones are destroyed, and
// •	If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
// At the end of the game, there is at most one stone left.
// Return the weight of the last remaining stone. If there are no stones left, return 0.
// https://leetcode.com/problems/last-stone-weight/


class Solution {
    public int lastStoneWeight(int[] stones) {
    //max priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : stones){ // adding the elements of array to pq
            pq.add(ele);
        }
        while(pq.size()>1){
            int max = pq.remove();
            int smax = pq.remove();
            int nstone = max - smax ;
            if(nstone!=0){
                pq.add(nstone);
            }
        }
        if(pq.size()==0){
            return 0 ;
        }else{
            return pq.remove();
        }
    }    
    }
