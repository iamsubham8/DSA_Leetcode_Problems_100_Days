// 257. Binary Tree Paths
// Given the root of a binary tree, return all root-to-leaf paths in any order.
// A leaf is a node with no children.
// https://leetcode.com/problems/binary-tree-paths/

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root==null){
            return ans ;
        }else if ( root.left == null && root.right == null){
            ans.add("" + root.val);
            return ans ;
        }

        List<String> leftAns = binaryTreePaths( root.left ) ;
         List<String> rightAns = binaryTreePaths( root.right ) ;

         for(String str : leftAns){
             ans.add(root.val + "->" + str);
         }
          for(String str : rightAns){
             ans.add(root.val + "->" + str);
         }

         return ans ;
    }
}


