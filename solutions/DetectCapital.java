/*
Problem Statement:
Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.

Problem Link:
    Detect Capital: https://leetcode.com/problems/detect-capital/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/DetectCapital.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public boolean detectCapitalUse(String word) {
         if(word.equals(word.toLowerCase()) || word.equals(word.toUpperCase()))
             return true;
         if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
             String str = word.substring(1);
             if(str.equals(str.toLowerCase()) || str.equals(str.toUpperCase()))
                 return true;
         }
         return false;
     }
 }
