/*
Problem Statement:
You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
Note: Given n will be a positive integer.

Problem Link:
    Climbing Stairs: https://leetcode.com/problems/climbing-stairs/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/ClimbingStairs.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     int answer[];
     public int climbStairs(int n) {
         answer = new int[n+2];
         answer[1]=1;
         answer[2]=2;
         for(int i=3;i<=n;i++)
             answer[i] = answer[i-1]+answer[i-2];
         return answer[n];
     }
 }
