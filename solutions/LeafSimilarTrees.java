/*
Problem Statement:
Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.

Problem Link:
    Leaf Similar Trees: https://leetcode.com/problems/leaf-similar-trees/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/FizzBuzz.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     List<Integer> leafValueSequence1 = new ArrayList<>();
     List<Integer> leafValueSequence2 = new ArrayList<>();
     public boolean leafSimilar(TreeNode root1, TreeNode root2) {
         getLeafValueSequence(root1, leafValueSequence1);
         getLeafValueSequence(root2, leafValueSequence2);
         if(leafValueSequence2.size()!=leafValueSequence1.size())
             return false;
         for(int i=0;i<leafValueSequence2.size();i++)
             if(leafValueSequence1.get(i)!=leafValueSequence2.get(i))
                 return false;
             return true;
     }
     public void getLeafValueSequence(TreeNode root, List<Integer> leafValueSequence){
         if(root==null)
             return;
         if(root.left==null && root.right==null){
             leafValueSequence.add(root.val);
             return;
         }
         if(root.left!=null)
             getLeafValueSequence(root.left, leafValueSequence);
         if(root.right!=null)
         getLeafValueSequence(root.right, leafValueSequence);
     }
 }
