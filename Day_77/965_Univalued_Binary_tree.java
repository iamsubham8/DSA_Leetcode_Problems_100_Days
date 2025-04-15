// 965. Univalued Binary Tree
// A binary tree is uni-valued if every node in the tree has the same value.
// Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.

// https://leetcode.com/problems/univalued-binary-tree/

class Solution {
    public boolean helper(TreeNode root , int val){
        if(root == null){
            return true ;
        }

        if(root.val != val){
            return false ;
        }

        boolean leftans = helper(root.left,val);
        boolean rightans = helper(root.right,val);
        return leftans && rightans;
    }
    public boolean isUnivalTree(TreeNode root) {
        return helper(root,root.val);
    }
}



