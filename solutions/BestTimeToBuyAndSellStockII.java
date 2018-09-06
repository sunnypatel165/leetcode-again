/*
Problem Statement:
Say you have an array for which the ith element is the price of a given stock on day i.
Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).
Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

Problem Link:
    Best time to Buy and Sell stock 2 :https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/BestTimeToBuyAndSellStockII.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public int maxProfit(int[] prices) {
         int answer =0;
         for(int i=1;i<prices.length;i++){
             if(prices[i] > prices[i-1])
                 answer += prices[i] - prices[i-1];
         }
         return answer;
     }
 }
