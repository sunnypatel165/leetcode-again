/*
Problem Statement:
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

Problem Link:
    Binary Tree Level Order Traversal 2: https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/BinaryTreeLevelOrderTraversal2.java

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
     public List<List<Integer>> levelOrderBottom(TreeNode root) {
         if(root==null){
             return new ArrayList<>();
         }
         LinkedList<List<Integer>> levelOrder = new LinkedList<>();
         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);

         while(!queue.isEmpty()){
             int size = queue.size();
             List<Integer> currentLevel = new ArrayList<>();
             for(int i =0;i<size;i++){
                 TreeNode t = queue.remove();
                 currentLevel.add(t.val);
                 if(t.left!=null){
                     queue.add(t.left);
                 }
                 if(t.right!=null){
                     queue.add(t.right);
                 }
             }
             levelOrder.addFirst(currentLevel);
         }
         return levelOrder;
     }
 }
