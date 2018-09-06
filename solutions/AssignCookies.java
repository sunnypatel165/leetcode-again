/*
Problem Statement:
Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie. Each child i has a greed factor gi, which is the minimum size of a cookie that the child will be content with; and each cookie j has a size sj. If sj >= gi, we can assign the cookie j to the child i, and the child i will be content. Your goal is to maximize the number of your content children and output the maximum number.

Note:
You may assume the greed factor is always positive.
You cannot assign more than one cookie to one child.

Problem Link:
    Assign Cookies: https://leetcode.com/problems/assign-cookies/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/AssignCookies.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public int findContentChildren(int[] g, int[] s) {
         if(s.length==0 || g.length==0)
             return 0;
         Arrays.sort(g);
         Arrays.sort(s);

         int answer = 0, pointer=0;

         for(int i=0;i<g.length && pointer<s.length;i++){
             while(pointer<s.length && g[i]>s[pointer]){
                 pointer++;
             }
             if(pointer==s.length)
                 break;
             if(g[i]<=s[pointer]){
                 answer++;
                 pointer++;
             }
         }
         return answer;
     }
 }
