/*
Problem Statement:
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

Problem Link:
    Binary Tree Level Order Traversal: https://leetcode.com/problems/binary-tree-level-order-traversal/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/BinaryTreeLevelOrderTraversal.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if(root==null)
            return answer;
        Queue queue = new ArrayDeque();

        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> nodesAtThisLevel = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode node = (TreeNode)queue.remove();

                if(node!=null){
                    nodesAtThisLevel.add(node.val);

                    if(node.left!=null)
                        queue.add(node.left);

                    if(node.right!=null)
                        queue.add(node.right);
                }
            }
            answer.add(nodesAtThisLevel);
        }
        return answer;
    }
}
