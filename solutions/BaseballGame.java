/*
Problem Statement:
You're now a baseball game point recorder.

Given a list of strings, each string can be one of the 4 following types:

Integer (one round's score): Directly represents the number of points you get in this round.
"+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
"D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
"C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
Each round's operation is permanent and could have an impact on the round before and the round after.

You need to return the sum of the points you could get in all the rounds.
Problem Link:
    Baseball Game https://leetcode.com/problems/baseball-game/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/BaseballGame.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 class Solution {
    public int calPoints(String[] ops) {
        int scores[] = new int[ops.length];
        int pointer = 0;
        int totalScore = 0;

        for(int i =0;i<ops.length;i++){
            if(ops[i].equals("C")){
                totalScore -= scores[pointer-1];
                pointer--;
            }
            else if(ops[i].equals("D")){
                int doubled = scores[pointer-1]*2;
                totalScore += doubled;
                scores[pointer++] = doubled;
            }
            else if(ops[i].equals("+")){
                int added = scores[pointer-1] + scores[pointer-2];
                totalScore += added;
                scores[pointer++] = added;
            }
            else{
                int roundScore = Integer.parseInt(ops[i]);
                scores[pointer++] = roundScore;
                totalScore += roundScore;
            }
        }
        return totalScore;
    }
}
