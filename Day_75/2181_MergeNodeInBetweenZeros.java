// 2181. Merge Nodes in Between Zeros
// You are given the head of a linked list, which contains a series of integers separated by 0's. The beginning and end of the linked list will have Node.val == 0.
// For every two consecutive 0's, merge all the nodes lying in between them into a single node whose value is the sum of all the merged nodes. The modified list should not contain any 0's.
// Return the head of the modified linked list.
// https://leetcode.com/problems/merge-nodes-in-between-zeros/

class Solution {
    public ListNode mergeNodes(ListNode head) {
      ListNode dummy = new ListNode(-1);
        ListNode ans = dummy ;
        ListNode curr = head.next;
        int sum = 0 ;
        while(curr!=null){

            if(curr.val !=0){
                sum += curr.val;
            }else{
                ListNode temp = new ListNode(sum);
                dummy.next = temp ;
                dummy = dummy.next;
                sum = 0 ;
            }
            curr = curr.next;
        }
    return ans.next;  
    }
}



