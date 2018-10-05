/*
Problem Statement:
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

Problem Link:
    Two Sum II:https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/TwoSumII.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public int[] twoSum(int[] numbers, int target) {
         int answer [] = new int[2];
         int left =0, right = numbers.length-1;
         while(numbers[left]+numbers[right]!=target){
             if(numbers[left]+ numbers[right]> target)
                 right--;
             else
                 left++;
         }
         answer[0]=left+1;
         answer[1]=right+1;
         return answer;

     }
 }
