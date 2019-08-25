/*
Problem Statement:
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Problem Link:
    Convert Sorted Array to Binary Search Tree: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/ConvertSortedArrayToBinarySearchTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return subArrayToBST(nums, 0, nums.length-1);
    }
    public TreeNode subArrayToBST(int[] nums, int start, int end){
        if(start >=0 && end <= nums.length-1 && start <= end){
            int middle = start + (end - start)/2;
            TreeNode root = new TreeNode(nums[middle]);
            root.left = subArrayToBST(nums, start, middle-1);
            root.right = subArrayToBST(nums, middle+1, end);
            return root;
        }
        return null;
    }
}
