/*
Problem Statement:
Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as:
    a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Problem Link:
    Balanced Binary Tree:https://leetcode.com/problems/balanced-binary-tree/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/BalancedBinaryTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
           return true;
        if(Math.abs(maxDepth(root.left) - maxDepth(root.right))>1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null && root.right == null){
            return 1;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }
}
