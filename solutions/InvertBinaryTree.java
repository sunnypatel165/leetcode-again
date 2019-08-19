/*
Problem Statement:
Invert a binary tree.

Problem Link:
    Invert Binary Tree:https://leetcode.com/problems/invert-binary-tree/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/InvertBinaryTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
         if(root==null){
            return null;
        }
        TreeNode newRoot = new TreeNode(root.val);
        newRoot.left = invertTree(root.right);
        newRoot.right = invertTree(root.left);
        return newRoot;
    }
}
