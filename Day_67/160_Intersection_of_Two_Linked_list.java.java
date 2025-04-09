// 160. Intersection of Two Linked Lists
// Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
// For example, the following two linked lists begin to intersect at node c1:
 
// The test cases are generated such that there are no cycles anywhere in the entire linked structure.
// Note that the linked lists must retain their original structure after the function returns.
// Custom Judge:
// The inputs to the judge are given as follows (your program is not given these inputs):
// •	intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
// •	listA - The first linked list.
// •	listB - The second linked list.
// •	skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
// •	skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
// The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.

// https://leetcode.com/problems/intersection-of-two-linked-lists/

public class Solution {
    public int sizeLL(ListNode head){
        int count = 0 ;
        ListNode ptr = head ;

        while(ptr!=null){
            count++;
            ptr = ptr.next;
        }
        return count ;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int size1 = sizeLL(headA);
        int size2 = sizeLL(headB);
        int diff = size1 - size2 ;
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;

        if(diff>0){  // LL1 is having greater size
            while(diff>0){
                ptr1 = ptr1.next;
                diff--;
            }
        }else{  // LL2 is having greater size
            while(diff<0){
                ptr2 = ptr2.next;
                diff++;
            }
        }

        while(ptr1!=ptr2){
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }
}
