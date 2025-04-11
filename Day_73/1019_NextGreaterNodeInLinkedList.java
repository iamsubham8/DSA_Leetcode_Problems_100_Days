// 1019. Next Greater Node In Linked List
// You are given the head of a linked list with n nodes.
// For each node in the list, find the value of the next greater node. That is, for each node, find the value of the first node that is next to it and has a strictly larger value than it.
// Return an integer array answer where answer[i] is the value of the next greater node of the ith node (1-indexed). If the ith node does not have a next greater node, set answer[i] = 0

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

//  https://leetcode.com/problems/next-greater-node-in-linked-list/
class Solution {
    public int sizeLL(ListNode head){
        ListNode curr = head ;
        int count = 0 ;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count ;
    }
    public ListNode reverseLL(ListNode head){
        ListNode curr = head ;
        ListNode pre = null ;

        while(curr!=null){
            ListNode temp = curr.next;

            curr.next = pre ;
            pre = curr ;
            curr = temp ;
        }
        return pre ;
    }
    public int[] nextLargerNodes(ListNode head) {
        int size = sizeLL(head);
        int[] arr = new int[size];
        ListNode nHead = reverseLL(head);

        Stack<Integer> st = new Stack<>();
        st.push(nHead.val);
        ListNode curr = nHead.next;
        int ptr = size-2 ;

        while(ptr>=0){

            int ele = curr.val;
            curr = curr.next;

            // check and pop
            while(st.size()>0 && st.peek()<=ele){
                st.pop();
            }

            // put in array
            if(st.size()==0){
                arr[ptr] = 0 ;
            }else{
                arr[ptr]= st.peek();
            }
            // push ele in stack
            st.push(ele);
            ptr--;
        }
        return arr ;
    }
}




