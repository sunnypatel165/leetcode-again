/*
Problem Statement:
Given a Binary Search Tree and a target number, return true if there exist two elements in the BST such that their sum is equal to the given target.

Problem Link:
    Two Sum IV - Input Is BST: https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/TwoSumIv.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 class Solution {
     public boolean findTarget(TreeNode root, int k) {
         // return findTargetHashSet(root, k);
         return findTargetTreeTraversal(root, k);
     }
     //O(1) space B-) - uses the fact that it is a BST.
     TreeNode parent = null;
     public boolean findTargetTreeTraversal(TreeNode root, int k ){
         if(parent==null)
             parent = root;
         if(root==null){
             return false;
         }
         TreeNode found = findNumber(parent, k-root.val);
         if(null!=found && found!=root){
             return true;
         }
         return findTarget(root.left, k) || findTarget(root.right, k);
     }
     public TreeNode findNumber(TreeNode parent, int x){
         if(parent==null){
             return null;
         }
         if(parent.val==x){
             return parent;
         }
         if(parent.val < x){
             return findNumber(parent.right, x);
         }else{
             return findNumber(parent.left, x);
         }
     }

     //Not O(1) - works similar to TwoSum using HashSet
     Set<Integer> set = new HashSet<>();
     public boolean findTargetHashSet(TreeNode root, int k){
         if(root == null){
             return false;
         }
         if(set.contains(k - root.val)){
             return true;
         }
         set.add(root.val);
         return findTargetHashSet(root.left,k) || findTargetHashSet(root.right, k);
     }
 }
