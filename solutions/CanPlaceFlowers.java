/*
Problem Statement:
Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.

Problem Link:
    Can Place Flowers: https://leetcode.com/problems/can-place-flowers/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/CanPlaceFlowers.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(n==0)
            return true;
        if(flowerbed.length==1){
            if(flowerbed[0]==0 && n<=1)
                return true;
            return false;
        }
        if(flowerbed.length==2){
            if(flowerbed[0]==0 && flowerbed[1]==0 && n<=1)
                return true;
            return false;
        }
        int answer=0;
        if(flowerbed[0]==0 && flowerbed[1]==0){
            answer++;
            flowerbed[0]=1;
        }
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i]==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                answer++;
                flowerbed[i]=1;
                if(answer>=n)
                    return true;
            }
        }
        int len = flowerbed.length;
        if(flowerbed[len-1]==0 && flowerbed[len-2]==0){
            answer++;
            flowerbed[len-1]=1;
        }
        return answer >= n;
    }
}
