/*
Problem Statement:
Given a binary tree, each node has value 0 or 1.  Each root-to-leaf path represents a binary number starting with the most significant bit.  For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent 01101 in binary, which is 13.
For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
Return the sum of these numbers.

Problem Link:
    Sum of Root Leaf Binary Number: https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/SumOfRootToLeafBinaryNumbers.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     int total =0;
     public int sumRootToLeaf(TreeNode root) {
         sumRootToLeafHelper(root, root.val);
         return total;
     }
     public void sumRootToLeafHelper(TreeNode root, int sum){
         if(root==null){
             return;
         }
         if(root.left==null && root.right==null){
             total +=sum;
         }
         if(root.left!=null){
             sumRootToLeafHelper(root.left, sum*2+ root.left.val);
         }
         if(root.right!=null){
             sumRootToLeafHelper(root.right, sum*2+ root.right.val);
         }
     }
 }
