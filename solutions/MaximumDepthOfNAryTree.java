/*
Problem Statement:
Given a n-ary tree, find its maximum depth.
The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Problem Link:
    Keyboard Row: https://leetcode.com/problems/maximum-depth-of-n-ary-tree/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/MaximumDepthOfNAryTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public int maxDepth(Node root) {
         if(root==null)
             return 0;

         int max = 0;
         for(Node node: root.children){
             max = Math.max(max, maxDepth(node));
         }
         return max+1;
     }
 }
