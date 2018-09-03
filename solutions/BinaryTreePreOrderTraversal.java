/*
Problem Statement:
Given a binary tree, return the preorder traversal of its nodes' values.

Problem Link:
    Binary Tree Preorder Traversal:https://leetcode.com/problems/binary-tree-preorder-traversal/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/BinryTreePreOrderTraversal.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
            return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
