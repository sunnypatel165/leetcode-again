/*
Problem Statement:
Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.

Problem Link:
    Minimum Moves To Equal Array Elements: https://leetcode.com/problems/minimum-moves-to-equal-array-elements/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/MinimumMovesToEqualArrayElements.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int minMoves(int[] nums) {
        int sum=0, min=Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            if(min>nums[i])
                min = nums[i];
            sum+=nums[i];
        }
        return sum - nums.length*min;

    }
}
