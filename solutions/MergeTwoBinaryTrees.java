/*
Problem Statement:
Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
You need to merge them into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of new tree.

Problem Link:
    Merge Two Binary Trees: https://leetcode.com/problems/merge-two-binary-trees/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/MergeTwoBinaryTrees.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    /*
    Pre requisite: Inorder traversal on a tree!
    A really simple solution for those(like me) who have a hard time dealing with recursion problems:
    Let's break this problem into conditions(Follow using the image in the problem)

    Case 1: When both t1 and t2 have a value
        -> In this case the new tree's node will have value equal to the sum of the two nodes.
        -> Hence, t3 = t1 + t2
        -> Then? Simple, recur to the left subtree and then to the right.

        -> The code looks something like:
        if(t1!=null && t2!=null)
            t3 = new TreeNode(t1.val+t2.val);
            t3.left = mergeTrees(t1.left, t2.left, t3.left);
            t3.right = mergeTrees(t1.right, t2.right, t3.right);

    Case 2: When t1 is null but t2 is not
        -> In this case the new tree's node will have value = t2's value.
        -> Hence, t3 = t2
        -> Then? Simple, since t1 is null, recur right and left subtrees of t2 ONLY.

        -> The code looks something like:
        if(t1==null  && t2!=null){
            t3 = new TreeNode(t2.val);
            t3.left = mergeTrees(t1, t2.left, t3.left);
            t3.right = mergeTrees(t1, t2.right, t3.right);

    Case 3: When t2 is null but t1 is not
        -> In this case the new tree's node will have value = t1's value.
        -> Hence, t3 = t1
        -> Then? Simple, since t2 is null, recur right and left subtrees of t1 ONLY.

        -> The code looks something like:
        if(t2==null && t1!=null)
            t3 = new TreeNode(t1.val);
            t3.left = mergeTrees(t1.left, t2, t3.left);
            t3.right = mergeTrees(t1.right, t2, t3.right);
    The above solution is pretty basic, works fine within the time limits but doesn't beat too many scores.
    If you wish to play around with this apporach - you can look at the mergeTreesBasic method at the bottom.

    Optimizing:
    If we look carefully, we can save some recursive calls.
    Essentially, what we are doing is - if either of the nodes is null, return the other one.
    If both are not null, add them and the recursively build the left and the right subtrees.
    This is the solution below. This soltuion beats more than 70% and is more consice.
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1==null && t2 ==null)
            return null;

        TreeNode t3 = new TreeNode(-1);
        return mergeTrees(t1, t2, t3);
        //return mergeTreesBasic(t1,t2,t3);
    }
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2, TreeNode t3){
        if(t1==null)
            return t2;
        if(t2==null)
            return t1;
        t3 = new TreeNode(t1.val + t2.val);
        t3.left = mergeTrees(t1.left, t2.left,t3.left);
        t3.right = mergeTrees(t1.right, t2.right,t3.right);
        return t3;
    }
    public TreeNode mergeTreesBasic(TreeNode t1, TreeNode t2, TreeNode t3){
        if(t1!=null && t2!=null){
            t3 = new TreeNode(t1.val+t2.val);
            t3.left = mergeTrees(t1.left, t2.left, t3.left);
            t3.right = mergeTrees(t1.right, t2.right, t3.right);
        }
        else if(t1==null  && t2!=null){
            t3 = new TreeNode(t2.val);
            t3.left = mergeTrees(t1, t2.left, t3.left);
            t3.right = mergeTrees(t1, t2.right, t3.right);
        }
        else if(t2==null && t1!=null){
            t3 = new TreeNode(t1.val);
            t3.left = mergeTrees(t1.left, t2, t3.left);
            t3.right = mergeTrees(t1.right, t2, t3.right);
        }
        return t3;
    }
}
