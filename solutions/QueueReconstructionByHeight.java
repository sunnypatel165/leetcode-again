/*
Problem Statement:
Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

Note:
The number of people is less than 1,100.

Problem Link:
    Assign Cookies: https://leetcode.com/problems/queue-reconstruction-by-height/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/QueueReconstructionByHeight.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int[][] reconstructQueue(int[][] people) {
         if (people.length == 0 || people[0].length == 0)
             return people;
         Arrays.sort(people, (x, y) -> x[0] == y[0] ? x[1] - y[1] : y[0] - x[0]);
        List<int[]> list = new ArrayList<int[]>();
        for (int i = 0; i < people.length; i++) {
            list.add(people[i][1],people[i]);
        }
        return list.toArray(new int[people.length][people[0].length]);
    }
}
