// 2816. Double a Number Represented as a Linked List
// You are given the head of a non-empty linked list representing a non-negative integer without leading zeroes.
// Return the head of the linked list after doubling it.
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
// https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/

class Solution {
    public ListNode reverseLL(ListNode head){
        ListNode curr = head ;
        ListNode pre = null ;

        while(curr!=null){
            ListNode temp = curr.next ;
            curr.next = pre ;
            pre = curr ;
            curr = temp ;
        }
        return pre ;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode nhead = reverseLL(head);
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy ;
        int carry = 0 ;

        while(nhead!=null){

            int sum = nhead.val  + nhead.val + carry ;
            int d = sum%10 ;
            carry = sum/10 ;
            ListNode temp = new ListNode(d);
            dummy.next = temp ;
            dummy = dummy.next ;
            nhead= nhead.next ;
        }

        if(carry>0){
           ListNode temp = new ListNode(carry);
            dummy.next = temp ;
        }
        ans = reverseLL(ans.next);
        return ans ;
    }
}



