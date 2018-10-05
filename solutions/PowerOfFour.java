/*
Problem Statement:
Given an integer (signed 32 bits), write a function to check whether it is a power of 4.


Problem Link:
    Power Of Four: https://leetcode.com/problems/power-of-four/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/PowerOfFour.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public boolean isPowerOfFour(int num) {
        int count=1, copy =num;
        while(num>0){
            num>>=1;
            count++;
        }
        return count%2==0 && (copy&copy-1)==0;
    }
}
