/*
Problem Statement:
Given an array of integers nums, write a method that returns the "pivot" index of this array.
We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.
If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

Problem Link:
    Find Pivot Index: https://leetcode.com/problems/find-pivot-index/solution/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/FindAndReplacePattern.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==0)
            return -1;

        int leftSum[] = new int[nums.length];
        leftSum[0] = nums[0];

        int rightSum[] = new int[nums.length];
        rightSum[nums.length-1] = nums[nums.length-1];

        for(int i= 1;i<nums.length;i++)
            leftSum[i] = leftSum[i-1]+nums[i];

        for(int i= nums.length-2;i>=0;i--)
            rightSum[i] = rightSum[i+1]+nums[i];

        for(int i=0;i<nums.length;i++){
            if(leftSum[i]==rightSum[i])
                return i;
        }
        return -1;
    }
}
