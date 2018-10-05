/*
Problem Statement:
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.

Problem Link:
    Min Stack: https://leetcode.com/problems/min-stack/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/MinStack.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class MinStack {
     Stack minStack = new Stack();
     Stack stack = new Stack();
     public MinStack() {
         minStack = new Stack();
     }

     public void push(int x) {
         stack.push(x);
         if(minStack.empty() || x < (int)minStack.peek())
             minStack.push(x);
         else
             minStack.push((int)minStack.peek());
     }

     public void pop() {
         if(!stack.isEmpty())
             stack.pop();
         if(!minStack.isEmpty())
         minStack.pop();

     }

     public int top() {
         if(stack.isEmpty())
             return 0;
         return (int)stack.peek();
     }

     public int getMin() {
         if(minStack.isEmpty())
             return 0;
         return (int)minStack.peek();
     }
 }
