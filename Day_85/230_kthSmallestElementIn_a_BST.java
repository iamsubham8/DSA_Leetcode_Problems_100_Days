// 230. Kth Smallest Element in a BST
// Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.
// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 

class Solution {
    int count=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        smallNum(root,k);
        return ans;
    }

    public void smallNum(TreeNode root,int k){
        if(root==null){
            return;
        }

        smallNum(root.left,k);
        count ++;
        if(count==k){
            ans = root.val;
        }
        smallNum(root.right,k);
    }
}
