/*
Problem Statement:
We are to write the letters of a given string S, from left to right into lines. Each line has maximum width 100 units, and if writing a letter would cause the width of the line to exceed 100 units, it is written on the next line. We are given an array widths, an array where widths[0] is the width of 'a', widths[1] is the width of 'b', ..., and widths[25] is the width of 'z'.
Now answer two questions: how many lines have at least one character from S, and what is the width used by the last such line? Return your answer as an integer list of length 2.

Problem Link:
    Number of Lines To Write String: https://leetcode.com/problems/number-of-lines-to-write-string/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/NumberOfLinesToWriteString.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 class Solution {
     public int[] numberOfLines(int[] widths, String S) {
         int lines=1, currLine = 100;
         for(int i=0;i<S.length();i++){
             char c= S.charAt(i);
             if(currLine < widths[c-'a']){
                 currLine = 100;
                 lines++;
             }
             currLine -= widths[c-'a'];
         }
         return new int[]{lines, 100-currLine};
     }
 }
