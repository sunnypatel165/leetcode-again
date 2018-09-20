/*
Problem Statement:
Given a column title as appear in an Excel sheet, return its corresponding column number.

Problem Link:
    Excel Sheet Column Number https://leetcode.com/problems/excel-sheet-column-number/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/ExcelSheetColumnNumber.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 class Solution {
    public int titleToNumber(String s) {
        int answer =0, pointer=0;
        for(int i=s.length()-1;i >=0;i--){
            answer += (Math.pow(26,pointer))*(s.charAt(i)-'A'+1);
            pointer++;
        }
        return answer;
    }
}
