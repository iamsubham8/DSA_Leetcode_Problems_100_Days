// 142. Linked List Cycle II
// Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
// There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.
// Do not modify the linked list.

// /**
//  * Definition for singly-linked list.
//  * class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) {
//  *         val = x;
//  *         next = null;
//  *     }
//  * }
//  */

//  https://leetcode.com/problems/linked-list-cycle-ii/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }

        ListNode fast = head ;
        ListNode slow = head ;
        ListNode ptr = head ;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow==fast){ // there is a cycle in ll

                while(ptr!=slow){
                    ptr = ptr.next;
                    slow = slow.next;
                }

                return ptr ;
            }
        }

        return null;  
    }
}


