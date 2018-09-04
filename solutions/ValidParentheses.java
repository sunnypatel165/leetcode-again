/*
Problem Statement:
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Problem Link:
    Valid Parentheses :https://leetcode.com/problems/valid-parentheses/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/ValidParentheses.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack stack = new Stack();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='(' || arr[i]=='{' || arr[i]=='[')
                stack.push(arr[i]);
            else{
                if(arr[i]==')' && (stack.isEmpty() || (char)stack.peek()!='('))
                    return false;
                if(arr[i]=='}' && (stack.isEmpty() || (char)stack.peek()!='{'))
                    return false;
                if(arr[i]==']' && (stack.isEmpty() || (char)stack.peek()!='['))
                    return false;
                stack.pop();
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}
