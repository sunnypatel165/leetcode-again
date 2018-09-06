/*
Problem Statement:
Given a binary tree, return the tilt of the whole tree.
The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and the sum of all right subtree node values. Null node has tilt 0.
The tilt of the whole tree is defined as the sum of all nodes' tilt.

Problem Link:
    Binary tree tilt: https://leetcode.com/problems/binary-tree-tilt/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/BinaryTreeTilt.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 /**
  * Definition for a binary tree node.
  * public class TreeNode {
  *     int val;
  *     TreeNode left;
  *     TreeNode right;
  *     TreeNode(int x) { val = x; }
  * }
  */
 class Solution {
         int answer =0 ;
     public int findTilt(TreeNode root) {
         findSumOfAllSubTrees(root);
         difference(root);
         //print(root);
         return answer;
     }
     public int findSumOfAllSubTrees(TreeNode root){
         if(root==null)
             return 0;
        if(root.left==null && root.right==null)
            return root.val;
         if(root.left==null && root.right!=null){
             root.val += findSumOfAllSubTrees(root.right);
             return root.val;
         }
         if(root.left!=null && root.right==null){
             root.val += findSumOfAllSubTrees(root.left);
             return root.val;
         }
         root.val = root.val+findSumOfAllSubTrees(root.left) + findSumOfAllSubTrees(root.right);
         return root.val;
     }
     public void difference(TreeNode root){
         if(root==null)
             return;
         if(root.left == null && root.right==null)
             return;
         if(root.left==null && root.right!=null){
             answer += Math.abs(root.right.val);
             difference(root.right);
         }
         else if(root.left!=null && root.right==null){
             answer += Math.abs(root.left.val);
             difference(root.left);
         }
         else{
             answer+= Math.abs(root.left.val - root.right.val);
             difference(root.left);
             difference(root.right);
         }
     }
     public void print(TreeNode root){
         if(root!=null){
             System.out.println(root.val);
             print(root.left);
             print(root.right);
         }
     }
 }
