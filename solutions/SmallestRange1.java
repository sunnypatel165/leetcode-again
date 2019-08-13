/*
Problem Statement:

Given an array A of integers, for each integer A[i] we may choose any x with -K <= x <= K, and add x to A[i].
After this process, we have some array B.
Return the smallest possible difference between the maximum value of B and the minimum value of B.

Problem Link:
    Smallest Range I: https://leetcode.com/problems/smallest-range-i/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/SmallestRange1.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int smallestRangeI(int[] A, int K) {
        int max = -1, min = 999999;
        for(int i =0;i<A.length;i++){
            if(A[i] > max){
                max = A[i];
            }
            if(A[i] < min){
                min = A[i];
            }
        }
        int answer = max - K - (min + K);
        if (answer>0){
            return answer;
        }
        return 0;
    }
}
