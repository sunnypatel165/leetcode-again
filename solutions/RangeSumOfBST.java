/*
Problem Statement:
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
The binary search tree is guaranteed to have unique values.

Problem Link:
    Range Sum of BST: https://leetcode.com/problems/range-sum-of-bst/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/RangeSumOfBST.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int rangeSumBST(TreeNode root, int L, int R) {
        if(root==null){
            return 0;
        }
        if(root.val<L)
            return rangeSumBST(root.right, L, R);
        if(root.val>R)
            return rangeSumBST(root.left, L, R);
        return root.val+ rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R);
    }
}
