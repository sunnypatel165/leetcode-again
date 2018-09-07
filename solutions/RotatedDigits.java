/*
Problem Statement:
X is a good number if after rotating each digit individually by 180 degrees, we get a valid number that is different from X.  Each digit must be rotated - we cannot choose to leave it alone.
A number is valid if each digit remains a digit after rotation. 0, 1, and 8 rotate to themselves; 2 and 5 rotate to each other; 6 and 9 rotate to each other, and the rest of the numbers do not rotate to any other number and become invalid.
Now given a positive number N, how many numbers X from 1 to N are good?

Problem Link:
    Rotated Digits: https://leetcode.com/problems/rotated-digits/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/RotatedDigits.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

class Solution {
    public int rotatedDigits(int N) {
        int answer = 0;
        int memo[] = new int[10001];

        for(int i =0;i<=N;i++){
            if(i<10 && i==0 || i ==1 || i==8){
                memo[i]=1;
                continue;
            }
            else if(i<10 && i==2 || i==5 || i==6 || i==9 ){
                memo[i]=2;
                answer++;
                continue;
            }
            else if(memo[i/10]==1 && memo[i%10]==1)
                memo[i]=1;
            else if(memo[i/10]>=1 && memo[i%10]>=1){
                memo[i]=2;
                answer++;
            }
        }
        return answer;
    }
}
