/*
Problem Statement:
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.


Problem Link:
    Add Digits: https://leetcode.com/problems/add-digits/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/AddDigits.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public int addDigits(int num) {
         if(num==0) return 0;
         return (num%9 ==0 ? 9 : num%9);
         //return addAllDigits(num);
     }
     public int addAllDigits(int num){
         while(num != num%10){
             num = sumOfDigits(num);
         }
         return num;
     }
     public int sumOfDigits(int num){
         int sum=0;
         while(num > 0){
             sum+=num%10;
             num/=10;
         }
         return sum;
     }
 }
