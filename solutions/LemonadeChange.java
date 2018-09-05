/*
Problem Statement:
At a lemonade stand, each lemonade costs $5.
Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).
Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.
Note that you don't have any change in hand at first.
Return true if and only if you can provide every customer with correct change.

Problem Link:
    Lemonade Change:https://leetcode.com/problems/lemonade-change/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/lemonadeChange.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    int five=0, ten=0, twenty=0;

    public boolean lemonadeChange(int[] bills) {

        for(int i =0;i<bills.length;i++){
            int value = bills[i];
            if(value==5)
                five++;
            if(value==10)
                ten++;
            if(value==20)
                twenty++;

            value -= 5;
            if(!checkPossible(value))
                return false;
        }
        return true;
    }
    public boolean checkPossible(int value){
        ////////////15////////////
            if(value==15 && ten>=1){
                ten--;
                value-=10;
            }
            else if(value==15 && five>=3){
                five -=3;
                return true;
            }

            ////////////10////////////
            if(value==10 && ten>=1){
                ten--;
                return true;
            }
            else if(value==10 && five>=2){
                five -= 2;
                value -=10;
                return true;
            }
            else if(value==10){
                return false;
            }

            ////////////5////////////
            if(value==5 && five<=0){
                return false;
            }
            else if(value==5){
                five--;
                value=0;
                return true;
            }
            if(value!=0)
                return false;
        return true;
    }
}
