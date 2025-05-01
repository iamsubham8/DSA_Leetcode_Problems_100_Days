// 700. Search in a Binary Search Tree
// You are given the root of a binary search tree (BST) and an integer val.
// Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
// https://leetcode.com/problems/search-in-a-binary-search-tree/

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp = root ;

        while(temp!=null){
            if(temp.val == val){
                break;
            }else if (temp.val > val){
                temp = temp.left ;
            }else{
                temp = temp.right ;
            }
        }
        return temp ;
    }
}




