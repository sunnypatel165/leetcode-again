/*
Problem Statement:
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
Note: A leaf is a node with no children.

Problem Link:
    Minimum Depth of a Binary Tree: https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/MinimumDepthOfABinaryTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public int minDepth(TreeNode root){
        if(root==null)
            return 0;
        if(root.left==null && root.right == null)
            return 1;
        if(root.left==null)
            return 1+minDepth(root.right);
        if(root.right==null)
            return 1+minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
