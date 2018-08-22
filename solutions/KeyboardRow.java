/*
Problem Statement:
Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

Problem Link:
    Keyboard Row: https://leetcode.com/problems/keyboard-row/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/KeyboardRow.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 class Solution {

     Map<Character, Integer> map = new HashMap<>();
     int row[] = new int[26];
     public String[] findWords(String[] words) {
         char[] row1="qwertyuiop".toCharArray();
         char[] row2="asdfghjkl".toCharArray();
         char[] row3="zxcvbnm".toCharArray();

         for(int i=0;i<row1.length;i++){
             row[row1[i]-'a']=1;
         }
         for(int i=0;i<row2.length;i++){
             row[row2[i]-'a']=2;
         }
         for(int i=0;i<row3.length;i++){
             row[row3[i]-'a']=3;
         }

         List<String> list = new ArrayList<>();


         for(int i =0;i<words.length;i++){
             if(isOnOneRow(words[i]))
                 list.add(words[i]);
         }

         String[] ans = new String[list.size()];
         for(int i=0;i<list.size();i++){
             ans[i]=list.get(i);
         }
         return ans;
     }
     public boolean isOnOneRow(String s){
         char c[] = s.toLowerCase().toCharArray();
         int pos = row[c[0]-'a'];
         for(int i=1;i<c.length;i++){
             if(row[c[i]-'a']!=pos)
                 return false;
         }
         return true;
     }
     public boolean isOnOneRowUsingMap(String s){
         map.put('q',1);
         map.put('w',1);
         map.put('e',1);
         map.put('r',1);
         map.put('t',1);
         map.put('y',1);
         map.put('y',1);
         map.put('u',1);
         map.put('i',1);
         map.put('o',1);
         map.put('p',1);

         map.put('a',2);
         map.put('s',2);
         map.put('d',2);
         map.put('f',2);
         map.put('g',2);
         map.put('h',2);
         map.put('j',2);
         map.put('k',2);
         map.put('l',2);

         map.put('z',3);
         map.put('x',3);
         map.put('c',3);
         map.put('v',3);
         map.put('b',3);
         map.put('n',3);
         map.put('m',3);
         s = s.toLowerCase();
         char[] c = s.toCharArray();
         int pos = map.get(c[0]);
         for(int i =1;i<c.length;i++){
             if(map.get(c[i]) != pos)
                 return false;
             }
         return true;
     }
 }
