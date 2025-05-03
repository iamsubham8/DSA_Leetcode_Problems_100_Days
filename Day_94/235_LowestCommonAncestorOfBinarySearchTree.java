// 235. Lowest Common Ancestor of a Binary Search Tree
// Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
// According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null ;
        }

        TreeNode temp = root ;
        while(temp!=null){
            if(temp.val> p.val && temp.val > q.val){
                temp = temp.left ;
            }else if ( temp.val < p.val && temp.val<q.val){
                temp = temp.right;
            }else{
                break;
            }
        }
        return temp ;
    }
}
