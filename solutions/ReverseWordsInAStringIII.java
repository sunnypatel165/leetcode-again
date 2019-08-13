/*
Problem Statement:
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Problem Link:
    Reverse Words In A String III: https://leetcode.com/problems/reverse-words-in-a-string-iii/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/ReverseWordsInAStringIII.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public String reverseWords(String s) {
         char[] c = s.toCharArray();
         for(int i =0;i<c.length;){
             int space = getNextSpace(c, i);
             reverseInRange(c, i, space-1);
             i = space+1;
         }
         return new String(c);
     }
     public int getNextSpace(char s[], int start){
         while(start<s.length){
             if(s[start]==' ')
                 return start;
             start++;
         }
         return start;
     }
     public void reverseInRange(char[] s, int start, int end){
         int size = end-start+1;
         for(int i=start;i<=(start + (end-start)/2);i++){
             char c = s[i];
             s[i]=s[start+size+start-i-1];
             s[start+size+start-i-1]=c;
         }
     }
 }
