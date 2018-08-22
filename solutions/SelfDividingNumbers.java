/*
Problem Statement:
A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
Also, a self-dividing number is not allowed to contain the digit zero.
Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Problem Link:
    Self Dividing Numbers: https://leetcode.com/problems/self-dividing-numbers/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/selfDividingNumbers.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left;i<=right;i++)
            if(isSelfDividingNumber(i))
                list.add(i);
        return list;
    }
    /**
     * Check each digit of the number to see if they divide the number with a 0 remainder.
     * [isSelfDividingNumber Checks if the number is a Self Dividing Number]
     * @param  n [number to be checked]
     * @return   [true if the numeber is Self Dividing]
     */
    private boolean isSelfDividingNumber(int n){
        int copy = n;
        while(n!=0){
            int digit = n%10;
            if(digit==0 || copy%digit!=0)
                return false;
            n/=10;
        }
        return true;
    }
}
