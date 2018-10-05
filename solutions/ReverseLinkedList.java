/*
Problem Statement:
Reverse a singly linked list.

Problem Link:
    Reverse Linked List: https://leetcode.com/problems/reverse-linked-list/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/ReverseLinkedList.java

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
 /**
  * Definition for singly-linked list.
  * public class ListNode {
  *     int val;
  *     ListNode next;
  *     ListNode(int x) { val = x; }
  * }
  */
 class Solution {
     public ListNode reverseList(ListNode head) {
         return reverseListIterative(head);
         //return reverseListUsingRecursion(head);
         //return reverseListUsingStack(head);
     }
     public ListNode reverseListUsingRecursion(ListNode head) {
         if(head==null || head.next==null)
             return head;
         ListNode nextNode=head.next;
         ListNode newHead=reverseList(nextNode);
         nextNode.next=head;
         head.next=null;
         return newHead;
     }
     public ListNode reverseListIterative(ListNode head){
          if(head==null || head.next==null)
             return head;
         ListNode previousNode = null, nextNode = head;

         while(nextNode!=null){
             ListNode temp = nextNode.next;
             nextNode.next = previousNode;
             previousNode = nextNode;
             nextNode = temp;
         }
         return previousNode;
     }
     public ListNode reverseListUsingStack(ListNode head){
          if(head==null)
             return null;

         Stack<ListNode> stack = new Stack<>();
         while(head!=null){
             stack.push(head);
             head = head.next;
         }

         ListNode reverseHead, reverse;
         reverseHead = new ListNode(stack.pop().val);
         reverse = reverseHead;
         while(!stack.isEmpty()){
             reverse.next = new ListNode(stack.pop().val);
             reverse = reverse.next;
         }
         return reverseHead;
     }
 }
