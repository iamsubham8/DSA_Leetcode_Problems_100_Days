// Day – 61
// 234. Palindrome Linked List
// Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
// / * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// https://leetcode.com/problems/palindrome-linked-list/

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode start = head;
        while(start!=null){
            st.push(start.val);
            start=start.next;
        }
        ListNode ptr = head;
        while(ptr!=null){
            int val1 = ptr.val;
            int val2 = st.pop();
                     if(val1!=val2){
                return false;
            }
            ptr=ptr.next;
        }
        return true;
    }
}
