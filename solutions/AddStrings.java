/*
Problem Statement:
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.

Problem Link:
    Add Strings: https://leetcode.com/problems/add-strings/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/AddStrings.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public String addStrings(String num1, String num2) {

         String bigger="", smaller="";
         if(num1.length() > num2.length()){
             bigger = num1;
             smaller = num2;
         }
         if(num1.length() <= num2.length()){
             smaller = num1;
             bigger=num2;
         }
         StringBuilder answer = new StringBuilder();
         int carry=0;
         for(int i = smaller.length()-1,j=bigger.length()-1;i>=0;i--,j--){
             int sum = smaller.charAt(i)-'0' + bigger.charAt(j)-'0' + carry;
             answer.append((char)(sum%10+'0'));
             carry = sum/10;
         }
         for(int i = bigger.length()-smaller.length()-1;i>=0;i--){
             int sum = bigger.charAt(i)-'0' + carry;
             answer.append((char)(sum%10+'0'));
             carry = sum/10;
         }

         if(carry==1) answer.append('1');
         return answer.reverse().toString();
     }
 }
