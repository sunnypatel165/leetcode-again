/*
Problem Statement:
Design a class to find the kth largest element in a stream.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
Your KthLargest class will have a constructor which accepts an integer k and an integer array nums, which contains initial elements from the stream.
For each call to the method KthLargest.add, return the element representing the kth largest element in the stream.

Problem Link:
    Kth Largest Element In A Stream: https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/KthLargestElementInAStream.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class KthLargest {
         final PriorityQueue<Integer> q;
         final int k;

         public KthLargest(int k, int[] a) {
             this.k = k;
             q = new PriorityQueue<>(k);
             for (int n : a)
                 add(n);
         }

         public int add(int n) {
             if (q.size() < k)
                 q.offer(n);
             else if (q.peek() < n) {
                 q.poll();
                 q.offer(n);
             }
             return q.peek();
         }
     }
