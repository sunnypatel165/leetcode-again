/*
Problem Statement:
Given a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

Problem Link:
    Linked List Cycle: https://leetcode.com/problems/linked-list-cycle/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/LinkedListCycle.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 
 public class Solution {
     public boolean hasCycle(ListNode head) {
         if(head==null)
             return false;

         ListNode second = head.next;

         while(second!=null && head.next!=null && second.next!=null){
             if(head == second)
                 return true;
             head = head.next;
             second = second.next.next;
         }
         return false;
     }
 }
