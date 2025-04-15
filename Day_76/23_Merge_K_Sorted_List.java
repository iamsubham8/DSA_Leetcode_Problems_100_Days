// Day – 76
// 23. Merge k Sorted Lists
// You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
// Merge all the linked-lists into one sorted linked-list and return it.
 
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// https://leetcode.com/problems/merge-k-sorted-lists/


class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0 ){
            return null;
        }else if ( lists.length == 1){
            return lists[0];
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);

        for(int i=0;i<lists.length;i++){
            ListNode temphead = lists[i];
            while(temphead!=null){
                pq.add(temphead);
                temphead=temphead.next;
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy ;

        while(pq.size()>0){
            ListNode node = pq.remove();
            dummy.next = node ;
            dummy = dummy.next;
        }
        dummy.next = null;
        return ans.next;
    }
}
