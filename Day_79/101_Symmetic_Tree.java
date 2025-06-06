// Day – 79
// 101. Symmetric Tree
// Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

// https://leetcode.com/problems/symmetric-tree/

class Solution {
    public boolean helper(TreeNode root1 , TreeNode root2){
        if(root1 == null || root2 == null){
            return root1 == root2 ;
        }
        if(root1.val == root2.val){
            boolean ans1 = helper(root1.left , root2.right);
            boolean ans2 = helper(root1.right,root2.left);
            return ans1 && ans2 ;
        }else{
            return false ;
        }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true ;
        }
        return helper(root.left , root.right);
    }
}
