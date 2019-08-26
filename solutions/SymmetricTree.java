/*
Problem Statement:
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

Problem Link:
    Symmetric Tree: https://leetcode.com/problems/symmetric-tree/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/SymmetricTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 class Solution {
     public boolean isSymmetric(TreeNode root) {
         return isSymmetricIterativeSmart(root);
         // return isSymmetricRecursive(root, root);
         // return isSymmetricIterative(root);
     }
     public boolean isSymmetricRecursive(TreeNode left, TreeNode right){
         if(left==null && right==null) return true;
         if(left==null || right==null) return false;
         return left.val == right.val &&
                 isSymmetricRecursive(left.left, right.right) &&
                 isSymmetricRecursive(left.right, right.left);
     }
     public boolean isSymmetricIterative(TreeNode root){
         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);
         while(!queue.isEmpty()){
             int size = queue.size();
             List<TreeNode> list = new ArrayList<>();
             for(int i =0;i<size;i++){
                 TreeNode t = queue.remove();
                 list.add(t);
                 if(t!=null){
                     queue.add(t.left);
                     queue.add(t.right);
                 }
             }
             for(int i=0;i<list.size()/2;i++){
                 TreeNode a = list.get(i);
                 TreeNode b = list.get(list.size()-i-1);
                 if(a==null && b==null){
                     continue;
                 }
                 if(a==null || b==null){
                     return false;
                 }
                 if(a.val!=b.val){
                     return false;
                 }
             }
         }
         return true;
     }
     public boolean isSymmetricIterativeSmart(TreeNode root){
         if(root==null){
             return true;
         }
         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root.left);
         queue.add(root.right);
         while(!queue.isEmpty()){
             TreeNode t1 = queue.remove();
             TreeNode t2 = queue.remove();
             if(t1==null && t2==null){
                 continue;
             }
             if(t1==null || t2==null){
                 return false;
             }
             if(t1.val!=t2.val){
                 return false;
             }
             queue.add(t1.left);
             queue.add(t2.right);
             queue.add(t1.right);
             queue.add(t2.left);

         }
         return true;
     }
 }
