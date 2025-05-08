// 109. Convert Sorted List to Binary Search Tree
// Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height-balanced binary search tree.
// https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/

class Solution {
    public ListNode middleNode(ListNode head){
        if(head == null){
            return null;
        }

        ListNode fast = head ;
        ListNode slow = head ;
        ListNode pre = slow ;

        while(fast!=null && fast.next!=null){
             pre = slow ;
             slow = slow.next;
             fast = fast.next.next ;
         }
            pre.next = null;
         return slow ;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }else if ( head.next == null){
            TreeNode root = new TreeNode(head.val);
            return root ;
        }

        ListNode mid = middleNode(head);
        TreeNode root = new TreeNode(mid.val);
        root.left = sortedListToBST(head) ;
        root.right = sortedListToBST(mid.next);

        return root ;
    }
}


