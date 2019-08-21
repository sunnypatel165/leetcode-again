/*
Problem Statement:
In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.
Two nodes of a binary tree are cousins if they have the same depth, but have different parents.
We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.
Return true if and only if the nodes corresponding to the values x and y are cousins.

Problem Link:
    Cousins in Binary Tree: https://leetcode.com/problems/cousins-in-binary-tree/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/CousinsInBinaryTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public boolean isCousins(TreeNode root, int x, int y) {
         Queue<TreeNode> queue = new LinkedList<>();
         queue.add(root);

         int level =0;
         int xl=-1, yl=-1;
         TreeNode xp=null, yp=null;
         while(!queue.isEmpty() && (xl==-1 || yl==-1)){
             int size = queue.size();
             for(int i =0;i<size;i++){
                 TreeNode t = queue.poll();
                 if(t.left!=null){
                     if(t.left.val == x){
                         xl = level;
                         xp = t;
                     }
                      if(t.left.val == y){
                         yl = level;
                         yp = t;
                     }
                     queue.offer(t.left);
                 }
                 if(t.right!=null){
                     if(t.right.val == x){
                         xl = level;
                         xp = t;
                     }
                      if(t.right.val == y){
                         yl = level;
                         yp = t;
                     }
                     queue.offer(t.right);
                 }
             }
             if(xl!=-1 && yl!=-1 && xp!=yp) return true;
             if(xl!=-1 || yl!=-1) return false;
             level++;
         }
         return xl!=-1 && yl!=-1 && xp!=null && yp!=null && xl==yl && xp!=yp;
     }
 }
