/*
Problem Statement:
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Problem Link:
    Add Strings: https://leetcode.com/problems/first-unique-character-in-a-string/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/FirstUniqueCharacterInAString.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            if(freq.get(c)==1){
               return i;
            }
        }
        return -1;

    }
}
