/*
Problem Statement:
You have a list of words and a pattern, and you want to know which words in words matches the pattern.
A word matches the pattern if there exists a permutation of letters p so that after replacing every letter x in the pattern with p(x), we get the desired word.
(Recall that a permutation of letters is a bijection from letters to letters: every letter maps to another letter, and no two letters map to the same letter.)
Return a list of the words in words that match the given pattern.
You may return the answer in any order.
You need to return the sum of the points you could get in all the rounds.

Problem Link:
    Find And Replace Pattern: https://leetcode.com/problems/find-and-replace-pattern/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/FindAndReplacePattern.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public List<String> findAndReplacePattern(String[] words, String pattern) {
         List<String> matchingWords = new ArrayList<>();
         for(String word: words){
             if(matchesPattern(word, pattern))
                 matchingWords.add(word);
         }
         return matchingWords;
     }
     public boolean matchesPattern(String word, String pattern){
         if(word.length() != pattern.length())
             return false;

         char patternToWordMap[] = new char[256];
         char wordToPatternMap[] = new char[256];

         for(int i=0;i<word.length();i++){
             char patternChar = pattern.charAt(i);
             char wordChar = word.charAt(i);

             if(patternToWordMap[patternChar] == '\u0000' && wordToPatternMap[wordChar] == '\u0000' ){
                 patternToWordMap[patternChar] = wordChar;
                 wordToPatternMap[wordChar] = patternChar;
             }
             else if(patternToWordMap[patternChar] == '\u0000' && wordToPatternMap[wordChar] != '\u0000' )
                 return false;
             else if(patternToWordMap[patternChar] != '\u0000' && wordToPatternMap[wordChar] == '\u0000' )
                 return false;
             else if(patternToWordMap[patternChar]!=wordChar || wordToPatternMap[wordChar]!=patternChar)
                 return false;
         }
         return true;
     }
 }
