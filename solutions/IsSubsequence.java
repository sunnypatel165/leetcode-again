/*
Problem Statement:
Given a string s and a string t, check if s is subsequence of t.
You may assume that there is only lower case English letters in both s and t.
t is potentially a very long (length ~= 500,000) string, and s is a short string (<=100).
A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).

Problem Link:
    Is Subsequence: https://leetcode.com/problems/is-subsequence/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/IsSubsequence.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 class Solution {
     public boolean isSubsequence(String s, String t) {
         int pointer = 0;
         if (s.length() == 0 ) {
             return true;
         }
         for (int i=0;i<t.length();i++) {
             if (s.charAt(pointer) == t.charAt(i)) {
                 pointer++;
                 if (pointer == s.length()) {
                     return true;
                 }
             }
         }
         return false;
     }
 }
