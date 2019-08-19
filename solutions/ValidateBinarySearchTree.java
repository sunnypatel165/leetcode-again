/*
Problem Statement:
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:
The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

Problem Link:
    Validate Binary Search Tree: https://leetcode.com/problems/validate-binary-search-tree/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/ValidateBinarySearchTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, null, null);
     }
     public boolean isValidBSTHelper(TreeNode root, Integer lower, Integer higher){
         if(root==null)
             return true;
         if((lower!=null && root.val <=lower) ||
             (higher!=null && root.val >=higher)){
             return false;
         }
         return isValidBSTHelper(root.right, root.val, higher) && isValidBSTHelper(root.left, lower, root.val);
     }
 }
