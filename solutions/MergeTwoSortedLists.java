/*
Problem Statement:
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

Problem Link:
    Merge Two Sorted Lists:https://leetcode.com/problems/merge-two-sorted-lists/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/MergeTwoSortedLists.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 /**
  * Definition for singly-linked list.
  * public class ListNode {
  *     int val;
  *     ListNode next;
  *     ListNode(int x) { val = x; }
  * }
  */
 class Solution {
     public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

         ListNode answer =new ListNode(0);
         ListNode headAnswer = answer;
         while(l1 != null && l2 != null){
             ListNode newNode = null;
             if(l1.val <= l2.val){
                 newNode = new ListNode(l1.val);
                 l1 = l1.next;
             }
             else{
                 newNode = new ListNode(l2.val);
                 l2 = l2.next;
             }
             answer.next = newNode;
             answer = answer.next;
         }
         if(l1!=null)
             answer.next = l1;
         if(l2!=null)
             answer.next = l2;
         return headAnswer.next;
     }
 }
