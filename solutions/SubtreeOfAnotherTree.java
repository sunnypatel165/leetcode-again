/*
Problem Statement:
Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s.
A subtree of s is a tree consists of a node in s and all of this node's descendants.
The tree s could also be considered as a subtree of itself.

Problem Link:
    Subtree Of Another Tree: https://leetcode.com/problems/subtree-of-another-tree/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/SubtreeOfAnotherTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null || t==null)
            return false;
        if(s.val == t.val){
            if(checkSubTrees(s,t) == true)
                return true;
        }
        return (isSubtree(s.left, t) || isSubtree(s.right, t));
    }
    public boolean checkSubTrees(TreeNode s, TreeNode t){
        if(s==null && t==null)
            return true;
        if((s!=null && t==null) || t!=null && s==null)
            return false;
        if(s.val != t.val)
            return false;
        return checkSubTrees(s.left, t.left) && checkSubTrees(s.right, t.right);
    }
}
