/*
Problem Statement:
A binary tree is univalued if every node in the tree has the same value.
Return true if and only if the given tree is univalued.

Problem Link:
    Univalued Binary Tree: https://leetcode.com/problems/univalued-binary-tree/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/UnivaluedBinaryTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
        return isUnivalTree(root, root.val);
    }
    public boolean isUnivalTree(TreeNode root, int val){
        if(root==null){
            return true;
        }
        if(root.val != val){
            return false;
        }
        return isUnivalTree(root.left, val) && isUnivalTree(root.right, val);
    }
}
