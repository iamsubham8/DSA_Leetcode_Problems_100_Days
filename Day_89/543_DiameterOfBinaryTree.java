// 543. Diameter of Binary Tree
// Given the root of a binary tree, return the length of the diameter of the tree.
// The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
// The length of a path between two nodes is represented by the number of edges between them.
// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// https://leetcode.com/problems/diameter-of-binary-tree/

class Solution {
    int dia = 0 ;
    public int height(TreeNode root){
        if(root == null){
            return 0 ;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        // currNode diameter = lh + rh
        dia = Math.max(lh+rh , dia  );

        return Math.max(lh , rh) +1 ;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0 ;
        }
        int h = height(root);
        return dia ;
    }
}
