// 203. Remove Linked List Elements
// Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

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
// https://leetcode.com/problems/remove-linked-list-elements/

class Solution {
    public ListNode removeElements(ListNode head, int val) {
       if(head == null){
            return null;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head ;
        ListNode curr = dummy ;

        while(curr.next!=null){

            if(curr.next.val==val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }

        return dummy.next;  
    }
}

