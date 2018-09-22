/*
Problem Statement:
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.

Problem Link:
    House Robber II:https://leetcode.com/problems/house-robber-ii/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/HouseRobberII.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int rob(int[] nums) {
        if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        int dp1[][] = new int[nums.length+1][2];

        for(int i =1;i<nums.length;i++){
            dp1[i][0] = Math.max(dp1[i-1][0], dp1[i-1][1]);
            dp1[i][1] = dp1[i-1][0] + nums[i-1];
        }

         int dp2[][] = new int[nums.length+1][2];

        for(int i =2;i<=nums.length;i++){
            dp2[i][0] = Math.max(dp2[i-1][0], dp2[i-1][1]);
            dp2[i][1] = dp2[i-1][0] + nums[i-1];
        }
        return Math.max(
            Math.max(dp1[nums.length-1][0], dp1[nums.length-1][1]),
             Math.max(dp2[nums.length][0], dp2[nums.length][1])
            );
    }
}
