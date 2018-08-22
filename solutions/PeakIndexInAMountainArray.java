/*
Problem Statement:
Let's call an array A a mountain if the following properties hold:
A.length >= 3
There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]

Problem Link:
    Peak Index in a Mountain Array: https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/peakIndexInMountainArray.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    /*
    This problem boils down to finding the max element in an array.
    This is due to the fact problem statement that we are "Given an array that is definitely a mountain".
    Think about it. 
     */
    public int peakIndexInMountainArray(int[] A) {
     int max = Integer.MIN_VALUE, maxIndex = -1;
        for(int i =0;i<A.length;i++){
            if(max < A[i]){
                max = A[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
