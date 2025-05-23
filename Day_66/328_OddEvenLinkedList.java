// Day – 66
// 328. Odd Even Linked List
// Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
// The first node is considered odd, and the second node is even, and so on.
// Note that the relative order inside both the even and odd groups should remain as it was in the input.
// You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 

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

//  https://leetcode.com/problems/odd-even-linked-list/

class Solution {
    public ListNode oddEvenList(ListNode head) {
         if(head == null || head.next == null || head.next.next == null){
            return head ;
        }
        ListNode oddHead = head ;
        ListNode evenHead = head.next ;
        ListNode evenStart = evenHead;

        while(evenHead!=null && evenHead.next!=null){
            oddHead.next = oddHead.next.next;
            evenHead.next = evenHead.next.next;

            oddHead = oddHead.next;
            evenHead = evenHead.next;
        }

        oddHead.next = evenStart;

        return head ;
    }
}
