/*
Problem Statement:
Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.

Problem Link:
    Array Partition 1: https://leetcode.com/problems/array-partition-i/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/ArrayPartition1.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

/*
There are 2 ways to solve this.
Approach 1:
    - Sort the array and run a loop and select every alternate element.
    - The complexity of this approach is o(NlogN) and doesn't beat many solutions.

Approach 2(used below):
    - Compute the frequency of each element since the range is known
    - Iterate over the frequency array and see if the current number is to be picked
    - For every element having a frequency > 1, we select it approximately half the number of times(details below)
    - The complexity is O(N) and beats 97% of the solutions!
 */
class Solution {
    private static final int MAX = 20010;
    private static final int OFFSET = 10000;
    public int arrayPairSum(int[] nums) {


        /*Create a frequency array to store the frequency of each number.
        Since the problem mentions the range as -10000 to 10000, we need to offset the numbers.
        To do this we basically add 10000 to the number and compute its frequency.
        */
        int frequency[] = new int [MAX];
        int n = nums.length;
        for(int i =0;i<n;i++){
            frequency[nums[i]+OFFSET]++;
        }

        int ans =0;
        boolean pickNext=true;
        int i=0;
        while(i<MAX && n>=0){

            //Find the next element with non-zero frequency
            while(i<MAX &&frequency[i]==0 ){
                i++;
            }
            /*We need to pick every alternate element
            So a while loop is run:
                -If the pick flag is true then add this value to answer and make the flag false
                -If the pick flag is false then make it true in order to pick the next one.

            Don't forget to subtract the offset when computing the answer.
            */
            while( i<MAX && frequency[i]!=0){
                if(pickNext){
                    ans+=(i-OFFSET);
                    pickNext=false;
                }
                else{
                    pickNext=true;
                }
                n--;
                frequency[i]--;
            }
        }
        return ans;
    }
}
