/*
Problem Statement:
Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.

Problem Link:
    Shortest Distance to a Character: https://leetcode.com/problems/shortest-distance-to-a-character/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/ShortestDistanceToACharacter.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 class Solution {
    public int[] shortestToChar(String S, char C) {
        char charArray[] = S.toCharArray();
        int answer[] = new int[charArray.length];

        int[] positionsOfC = findAllPositionsOfC(charArray,C);
        int pointer = 0;
        for(int i=0;i<charArray.length;i++){
            int diff1=Integer.MAX_VALUE, diff2=Integer.MAX_VALUE, diff3=Integer.MAX_VALUE;

            diff1 = Math.abs(positionsOfC[pointer]-i);

            if(positionsOfC[pointer + 1]!=-1)
                diff2 = Math.abs(positionsOfC[pointer+1]-i);

            if(pointer - 1 >=0)
                diff3 = Math.abs(positionsOfC[pointer-1]-i);

            int min = Math.min(diff1, Math.min(diff2, diff3));
            answer[i]= min;

            if(min==diff2)
                pointer++;
        }
        return answer;
      }
      public int[] findAllPositionsOfC(char[] charArray, char C){
        int[] positionsOfC = new int[10010];
        int pointer =0;
        for(int i =0;i<charArray.length;i++){
            if(charArray[i]==C)
                positionsOfC[pointer++] = i;
        }
        positionsOfC[pointer++]=-1;
        //System.out.println(Arrays.toString(positionsOfC));
        return positionsOfC;
    }
}
