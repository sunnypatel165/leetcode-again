/*
Problem Statement:
Given two binary trees, write a function to check if they are the same or not.
Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Problem Link:
    Same Tree: https://leetcode.com/problems/same-tree/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/SameTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public boolean isSameTree(TreeNode p, TreeNode q) {
         return isSameTreeIterative(p, q);
        //return isSameTreeRecursive(p, q);
     }
     public boolean isSameTreeIterative(TreeNode p, TreeNode q) {
         Queue<TreeNode> pq = new LinkedList<>();
         Queue<TreeNode> qq = new LinkedList<>();
         pq.add(p);
         qq.add(q);
         while(true){
             if(pq.isEmpty() && qq.isEmpty()){
                 return true;
             }
              if((pq.isEmpty() && !qq.isEmpty()) || (!pq.isEmpty() && qq.isEmpty())){
                 return false;
             }
             TreeNode pn = pq.remove();
             TreeNode qn = qq.remove();
             if((pn!=null && qn==null) || (pn==null && qn!=null)){
                 return false;
             }
             if(pn==null && qn==null){
                 continue;
             }
             if(pn.val != qn.val){
                 return false;
             }
             pq.add(pn.left);
             pq.add(pn.right);
             qq.add(qn.left);
             qq.add(qn.right);

         }
     }
      public boolean isSameTreeRecursive(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
         if((p!=null && q==null) ||
             (p==null && q!=null)){
             return false;
         }
         if(p.val != q.val)
             return false;
         return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
     }
 }
