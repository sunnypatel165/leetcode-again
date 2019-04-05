/*
Problem Statement:

Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:
    The root is the maximum number in the array.
    The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
    The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
Construct the maximum tree by the given array and output the root node of this tree.

Problem Link:
    Maximum Binary Tree: https://leetcode.com/problems/maximum-binary-tree/description/
    
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/MaximumBinaryTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0)
            return null;
        TreeNode node = new TreeNode(-1);
        return constructMaximumBinaryTree(nums, 0, nums.length-1);
    }
    /**
     * [constructMaximumBinaryTree Recursively constructs the maxmium tree as defined in the problem]
     * @param  nums  [The array of numbers to be converted to tree.]
     * @param  start [Starting index]
     * @param  end   [End index]
     * @return       [The root of the Maximum Binary Tree]
     */
    public TreeNode constructMaximumBinaryTree(int[] nums, int start, int end){
        int indexOfMaxElement = getIndexOfMaxElement(nums,start, end);
        if(indexOfMaxElement==-1 || start<0 || end >= nums.length)
            return null;
        TreeNode node = new TreeNode(nums[indexOfMaxElement]);
        node.left = constructMaximumBinaryTree(nums, start, indexOfMaxElement-1);
        node.right = constructMaximumBinaryTree(nums, indexOfMaxElement+1, end);
        return node;
    }
    /**
     * [getIndexOfMaxElement find the index of the maximum element in the array]
     * @param  a[]   [The array to be searched]
     * @param  start [Start index]
     * @param  end   [End index]
     * @return       [Index of the largest element. -1 if not found.]
     */
    public int getIndexOfMaxElement(int a[], int start, int end){
        int max = Integer.MIN_VALUE;
        int maxPosition = -1;
        for(int i=start; i<=end && end < a.length && start>=0;i++)
            if(max < a[i]){
                max = a[i];
                maxPosition = i;
            }
        return maxPosition;
    }
}
