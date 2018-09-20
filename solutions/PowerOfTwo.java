/*
Problem Statement:
Given an integer, write a function to determine if it is a power of two.


Problem Link:
    Power Of Two: https://leetcode.com/problems/power-of-two/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/PowerOfTwo.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>=1 && (n&n-1)==0;
    }
}
