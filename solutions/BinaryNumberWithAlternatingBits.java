/*
Problem Statement:
Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.


Problem Link:
    Binary Number with Alternating Bitshttps://leetcode.com/problems/binary-number-with-alternating-bits/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/BinaryNumberWithAlternatingBits.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public boolean hasAlternatingBits(int n) {
         return hasAlternatingBitsUsingBitWise(n);
         //return hasAlternatingBitsBruteForce(n);
     }
     public boolean hasAlternatingBitsUsingBitWise(int n){
         n = n ^ n>>1;
         return (n & n+1)==0;
     }
     public boolean hasAlternatingBitsBruteForce(int n) {
         String binary = Integer.toBinaryString(n);
         for(int i =1;i<binary.length();i++){
             if(binary.charAt(i)==binary.charAt(i-1))
                 return false;
         }
         return true;
     }
 }
