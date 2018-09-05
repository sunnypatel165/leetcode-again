/*
Problem Statement:
Given a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.

Problem Link:
    Convert BST to Greater Tree https://leetcode.com/problems/convert-bst-to-greater-tree/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/ConvertBstToGreaterTree.java

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
     int sum =0;
     public TreeNode convertBST(TreeNode root) {
         return convertBstIterative(root);
     }
     public TreeNode convertBstIterative(TreeNode root){
         TreeNode node = root;
         Stack stack = new Stack();
         while(!stack.isEmpty() || node!=null){

             while(node!=null){
                 stack.push(node.right);
                 node = node.right;
             }

             node = (TreeNode)stack.pop();
             node.val += sum;
             sum +=node.val;

             node = node.left;
         }
         return root;
     }
 }
