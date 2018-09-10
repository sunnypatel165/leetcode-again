/*
Problem Statement:
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Problem Link:
    Missing Numbers:https://leetcode.com/problems/missing-number/solution/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/MissingNumber.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int missingNumber(int[] nums) {
        int answer=nums.length;
        for(int i=0;i<nums.length;i++)
            answer = answer ^ nums[i] ^ i;
        return answer;
    }
}
