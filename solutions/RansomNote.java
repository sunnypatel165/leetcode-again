/*
Problem Statement:
Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

Each letter in the magazine string can only be used once in your ransom note.

Problem Link:
    Ransom Note: https://leetcode.com/problems/ransom-note/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/RansomNote.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int ransomFrequency[] = new int[26];
        int magazineFrequency[] = new int[26];

        for(int i=0;i<ransomNote.length();i++){
            ransomFrequency[ransomNote.charAt(i)-'a']++;
        }

        for(int i=0;i<magazine.length();i++){
            magazineFrequency[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(ransomFrequency[i] > magazineFrequency[i])
                return false;
        }
        return true;

    }
}
