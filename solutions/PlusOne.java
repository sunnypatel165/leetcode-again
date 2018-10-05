/*
Problem Statement:
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.

Problem Link:
    Plus One: https://leetcode.com/problems/plus-one/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/PlusOne.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public int[] plusOne(int[] digits) {
         int carry =0;
         digits[digits.length-1]+=1;
         if(digits[digits.length-1]==10){
             digits[digits.length-1]=0;
             carry = 1;
             for(int i=digits.length-1;i>=0;i--){
                 digits[i]=digits[i]+carry;
                 if(digits[i]==10){
                     carry = 1;
                     digits[i]=0;
                 }
                 else
                     carry =0;
             }
             if(carry == 1){
                 int answer[] = new int[digits.length+1];
                 System.arraycopy(digits,0,answer, 1, digits.length);
                 answer[0]=1;
                 return answer;
             }

         }
          return digits;

     }
 }
