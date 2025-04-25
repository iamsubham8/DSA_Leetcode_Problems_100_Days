// 199. Binary Tree Right Side View
// Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
// https://leetcode.com/problems/binary-tree-right-side-view/

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        rightView(root,ans,0);
        return ans;
    }

    //Modified Preorder Traversal : root--> Right--> Left-->
    public void rightView(TreeNode root,List<Integer> ans, int level){
        if(root==null){
            return;
        }

        if(ans.size() == level){
            ans.add(root.val);
        }

        rightView(root.right,ans,level+1);
        rightView(root.left,ans,level+1);
    }
}
