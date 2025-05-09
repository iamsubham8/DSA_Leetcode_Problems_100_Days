// 1382. Balance a Binary Search Tree
// Given the root of a binary search tree, return a balanced binary search tree with the same node values. If there is more than one answer, return any of them.
// A binary search tree is balanced if the depth of the two subtrees of every node never differs by more than 1.
// https://leetcode.com/problems/balance-a-binary-search-tree/
class Solution {
    public void inorder(TreeNode root , ArrayList<Integer> list  ){
        if(root == null){
            return ;
        }
        inorder(root.left , list );
        list.add(root.val);
        inorder(root.right , list );
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root , list );
        return BSTMaker(list , 0 , list.size()-1);
    }
    public TreeNode BSTMaker(ArrayList<Integer> list , int start , int end ){
        if(start > end ){
            return null;
        }
        int mid = (start + end )/2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = BSTMaker(list , start , mid-1 );
        root.right = BSTMaker(list,mid+1 , end);
        return root ;
    }
}
