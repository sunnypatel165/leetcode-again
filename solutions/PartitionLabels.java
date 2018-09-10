/*
Problem Statement:
A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.

Problem Link:
    Partition Lables: https://leetcode.com/problems/partition-labels/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/PartitionLabels.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 class Solution {
        int[] lastOccurance = new int[26];
    public List<Integer> partitionLabels(String S) {
        for(int i=0;i<S.length();i++){
            lastOccurance[S.charAt(i)-'a']=i;
        }
        List<Integer> answer = new ArrayList<>();
        int start = 0, ans=0;
        do{
            ans = getPatternEnd(S,start);
            answer.add(ans+1);
            start = ans+start+1;
        }
        while(start < S.length());
        return answer;
    }
    public int getPatternEnd(String s, int start){
        int currentPointer = start;
        int currentEnd = lastOccurance[s.charAt(start)-'a'];

        while(currentPointer<s.length() && currentPointer < currentEnd){
            if(lastOccurance[s.charAt(currentPointer)-'a'] >= currentEnd){
                currentEnd = lastOccurance[s.charAt(currentPointer)-'a'];
            }
            currentPointer++;
        }
        return currentEnd-start;
    }
}
