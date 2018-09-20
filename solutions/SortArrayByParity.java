/*
Problem Statement:
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
You may return any answer array that satisfies this condition.

Problem Link:
    Sort Array By Parity: https://leetcode.com/problems/sort-array-by-parity/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/SortArrayByParity.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public int[] sortArrayByParity(int[] A) {
         int[] answer = new int[A.length];
         int first = 0, last=A.length-1;
         for(int i =0;i<A.length;i++){
             if( (A[i] & 1) ==0)
                 answer[first++]=A[i];
             else
                 answer[last--]=A[i];
         }
         return answer;

     }
 }
