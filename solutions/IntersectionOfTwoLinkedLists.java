/*
Problem Statement:
Write a program to find the node at which the intersection of two singly linked lists begins.

Problem Link:
    Intersection Of Two Linked Lists: https://leetcode.com/problems/intersection-of-two-linked-lists/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/IntersectionOfTwoLinkedLists.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 public class Solution {
     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         int lengthOfA = findLength(headA);
         int lengthOfB = findLength(headB);
         int diff = Math.abs(lengthOfA - lengthOfB);
         if(lengthOfA > lengthOfB){
             while(diff-->0)
                 headA = headA.next;
         }
         else if(lengthOfA < lengthOfB){
              while(diff-->0)
                 headB = headB.next;
         }
         while(headA!=headB){
             headA = headA.next;
             headB = headB.next;
         }
         return headA;

     }
     public int findLength(ListNode node){
         int length =0 ;
         while(node!=null){
             node = node.next;
             length++;
         }
         return length;
     }
 }
