/*
Problem Statement:
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

Problem Link:
    Avergage of Levels in Binary Tree: https://leetcode.com/problems/average-of-levels-in-binary-tree/solution/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/AverageOfLevelsInBinaryTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public List<Double> averageOfLevels(TreeNode root) {
         List<Double> answer = new ArrayList<>();
         if(root==null)
             return answer;
         if(root.left==null && root.right==null){
             answer.add(root.val*1.0);
             return answer;
         }

         Queue<TreeNode> cq = new ArrayDeque<>();
             if(root.left!=null)
                 cq.add(root.left);
             if(root.right!=null)
                 cq.add(root.right);
         answer.add(root.val*1.0);
         while(!cq.isEmpty()){
             double sum = 0;
             int actualSize = cq.size();
             int size = actualSize;
             for(int i =0;i<actualSize;i++){
                 TreeNode node = cq.remove();
                 if(node==null){
                     size--;
                     continue;
                 }
                 sum+=node.val;
                 if(node.left!=null)
                 cq.add(node.left);
                 if(node.right!=null)
                 cq.add(node.right);
             }
             answer.add(sum*1.0/size);
         }
         return answer;
     }

 }
