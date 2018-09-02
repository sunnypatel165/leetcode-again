/*
Problem Statement:
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
Note: A leaf is a node with no children.

Problem Link:
    Path Sum:https://leetcode.com/problems/path-sum/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/DetectCapital.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSumHelper(root, 0, sum);

    }
    public boolean hasPathSumHelper(TreeNode root, int current, int sum){
        if(root==null)
            return false;
        if( root.left == null && root.right==null){
            if(current + root.val ==sum){
                return true;
            }
            return false;
        }
        return hasPathSumHelper(root.left, current+root.val, sum) || hasPathSumHelper(root.right, current+root.val, sum);
    }
}
