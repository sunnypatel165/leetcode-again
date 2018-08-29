/*
Problem Statement:
Given an integer array with even length, where different numbers in this array represent different kinds of candies.
Each number means one candy of the corresponding kind.
You need to distribute these candies equally in number to brother and sister.
 Return the maximum number of kinds of candies the sister could gain

Problem Link:
    Distribute Candies: https://leetcode.com/problems/distribute-candies/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/DistributeCandies.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public int distributeCandies(int[] candies) {

         boolean unique[] = new boolean[300010];
         int uniqueCount = 0;
         for(int i=0;i<candies.length;i++){
             if(unique[candies[i]+100000]==false){
                 uniqueCount++;
                 unique[candies[i]+100000]=true;
             }
         }
         return Math.min(uniqueCount, candies.length/2);

     }
 }
