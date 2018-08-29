/*
Problem Statement:
A peak element is an element that is greater than its neighbors.

Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that nums[-1] = nums[n] = -∞.

Problem Link:
    Find Peak Element: https://leetcode.com/problems/find-peak-element/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/BalancedBinaryTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public int findPeakElement(int[] nums) {
        int left=0, right = nums.length-1;
         while(left < right){
             int mid = (left + right)/2;
             if(nums[mid] > nums[mid+1])
                 right = mid;
             else
                 left = mid+1;
         }
         return left;
     }
 }
