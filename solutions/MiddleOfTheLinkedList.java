/*
Problem Statement:
Given a non-empty, singly linked list with head node head, return a middle node of linked list.
If there are two middle nodes, return the second middle node.

Problem Link:
    Middle of The Linked list: https://leetcode.com/problems/middle-of-the-linked-list/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/MiddleOfTheLinkedList.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;

        while(true){
            if(fast.next==null)
                return head;
            if(fast.next!=null && fast.next.next==null)
                return head.next;
            head = head.next;
            fast = fast.next.next;
        }

    }
}
