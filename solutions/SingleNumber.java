/*
Problem Statement:

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Problem Link:
    Single Number: https://leetcode.com/problems/single-number/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/SingleNumber.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public int singleNumber(int[] nums) {
         int ans = 0;
         for(int i = 0;i<nums.length;i++ )
             ans = ans ^ nums[i];
         return ans;
     }
 }
