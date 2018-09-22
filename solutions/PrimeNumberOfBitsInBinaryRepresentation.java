/*
Problem Statement:
Given two integers L and R, find the count of numbers in the range [L, R] (inclusive) having a prime number of set bits in their binary representation.
(Recall that the number of set bits an integer has is the number of 1s present when written in binary. For example, 21 written in binary is 10101 which has 3 set bits. Also, 1 is not a prime.)

Problem Link:
    Prime Number Of Bits Set in Binary Representation:https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/PrimeNumberOfBitsInBinaryRepresentation.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int countPrimeSetBits(int L, int R) {
        int answer =0;
        for(int i=L;i<=R;i++){
            int bits = Integer.bitCount(i);
            if(bits==2 || bits==3 || bits==5 || bits==7 || bits==11 || bits==13 || bits==17 || bits==19 )
                answer++;
        }
        return answer;
    }

    public int countSetBits(int n){
        int count=0;
        while(n>0){
            if(n%2==1)
                count++;
            n/=2;
        }
        return count;
    }
}
