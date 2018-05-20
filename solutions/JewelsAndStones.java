/*
Problem Statement:
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Problem Link:
    Jewels And Stones: https://leetcode.com/problems/jewels-and-stones/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/solutions/JewelsAndStones.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     /**
      * [countFrequencyOfCharacterInString returns an integer indicating frequency of the given char in the given string]
      * @param  s [String to be searched in]
      * @param  c [Character whose frequency is to be found]
      * @return   [frequency of c in s]
      */
     public int countFrequencyOfCharacterInString(String s, char c){
         if(s==null || s.length()==0)
             return 0;
         int frequency=0;
         for(int i=0;i<s.length();i++)
             if(s.charAt(i)==c)
                 frequency++;
         return frequency;
     }
     /**
      * [numJewelsInStones counts the number of stones that are jewels as well]
      * @param  J [Jewels]
      * @param  S [Stones]
      * @return   [number of stones which are jewels.]
      */
     public int numJewelsInStones(String J, String S) {
         int noOfJewelsAndStones = 0;
         for(int i=0;i<J.length();i++){
             char jewel = J.charAt(i);
             noOfJewelsAndStones += countFrequencyOfCharacterInString(S, jewel);
         }
         return noOfJewelsAndStones;
     }
 }
