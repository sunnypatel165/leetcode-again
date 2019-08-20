/*
Problem Statement:
Given a string, sort it in decreasing order based on the frequency of characters.

Problem Link:
    Sort Characters By Frequency: https://leetcode.com/problems/sort-characters-by-frequency/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/SortCharactersByFrequency.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     class Frequency{
         char c;
         int i;
     }
     public String frequencySort(String s) {
         Map<Character, Integer> map = new HashMap<>();
         for(int i=0;i<s.length();i++){
             char c = s.charAt(i);
             map.put(c, map.getOrDefault(c, 0)+1);
         }
         List<Frequency> list = new ArrayList<>();
         for(Map.Entry entry: map.entrySet()){
             Frequency f = new Frequency();
             f.c = (Character)entry.getKey();
             f.i = (Integer)entry.getValue();
             list.add(f);
         }
         Collections.sort(list, new Comparator<Frequency>(){
             public int compare(Frequency f1, Frequency f2){
                 return f2.i - f1.i;
             }
         });
         StringBuilder sb = new StringBuilder();
         for(Frequency f: list){
             for(int i=0;i<f.i;i++)
                 sb.append(f.c);
         }
         return sb.toString();
     }
 }
