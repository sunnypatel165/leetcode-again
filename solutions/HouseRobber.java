/*
Problem Statement:
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

Problem Link:
    House Robber: https://leetcode.com/problems/house-robber/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/HouseRobber.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public int rob(int[] nums) {
         int dp[][] = new int[nums.length+1][2];

         for(int i =1;i<=nums.length;i++){
             dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]);
             dp[i][1] = dp[i-1][0] + nums[i-1];
         }
         return Math.max(dp[nums.length][0], dp[nums.length][1]);
     }
 }
