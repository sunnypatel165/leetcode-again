/*
Problem Statement:
Alice and Bob have candy bars of different sizes: A[i] is the size of the i-th bar of candy that Alice has, and B[j] is the size of the j-th bar of candy that Bob has.
Since they are friends, they would like to exchange one candy bar each so that after the exchange, they both have the same total amount of candy.  (The total amount of candy a person has is the sum of the sizes of candy bars they have.)
Return an integer array ans where ans[0] is the size of the candy bar that Alice must exchange, and ans[1] is the size of the candy bar that Bob must exchange.
If there are multiple answers, you may return any one of them.  It is guaranteed an answer exists.


Problem Link:
    Fair Candy Swap: https://leetcode.com/problems/fair-candy-swap/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/FairCandySwap.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public int[] fairCandySwap(int[] A, int[] B) {
         int candiesWithA = 0, candiesWithB = 0;
         boolean frequencyB[] = new boolean[100010];
         int answer[] = new int[2];

         for(int i=0;i<A.length;i++)
             candiesWithA += A[i];

         for(int i=0;i<B.length;i++){
             candiesWithB += B[i];
             frequencyB[B[i]] = true;
         }

         int actualCandies = (candiesWithB - candiesWithA)/2;
         for(int i=0;i<A.length;i++){
             int pair = A[i]+actualCandies;
             if(pair >=0 && pair<=100010 && frequencyB[pair]){
                 answer[0] = A[i];
                 answer[1] = pair;
             }

         }
         return answer;
     }
 }
