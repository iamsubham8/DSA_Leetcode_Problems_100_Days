// Day – 83
// 103. Binary Tree Zigzag Level Order Traversal
// Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).
 
// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans ;
        }

        List<Integer> currAns = new ArrayList<>();
        Stack<TreeNode> main = new Stack<>();
         Stack<TreeNode> helper = new Stack<>();
         int level = 0 ;
         main.push(root);
         while(main.size()>0){
             TreeNode currNode = main.pop();
             currAns.add(currNode.val);
             if(level == 0 ){
                 if(currNode.left !=null){
                     helper.push(currNode.left);
                 }

                 if(currNode.right !=null){
                     helper.push(currNode.right);
                 }
             }else{
                if(currNode.right !=null){
                     helper.push(currNode.right);
                 }
                 if(currNode.left !=null){
                     helper.push(currNode.left);
                 }

             }

             if(main.size()==0){
                 ans.add(currAns);
                 currAns = new ArrayList<>();
                 level = 1-level ;

                main = helper ;
                helper = new Stack<>();
             }
         }
         return ans ;
    }
    }
}
