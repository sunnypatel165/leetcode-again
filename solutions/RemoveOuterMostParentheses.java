/*
Problem Statement:
A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.
Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.
Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.

Problem Link:
    Remove Outermost Parentheses: https://leetcode.com/problems/remove-outermost-parentheses/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/RemoveOuterMostParentheses.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public String removeOuterParentheses(String S) {
        return removeOuterParenthesesWithoutStack(S);
        //return removeOuterParenthesesUsingStack(S);
    }
    public String removeOuterParenthesesWithoutStack(String S) {
        StringBuilder answer = new StringBuilder();
        int start =0, end=0,count=0;
        while(start<S.length()){
           count++; end++;
            while(count!=0){
                if(S.charAt(end)=='('){
                    count++;
                     answer.append("(");
                } else {
                    count--;
                    if(count!=0)
                    answer.append(")");
                }

                end++;
            }
            start = end;
        }
        return answer.toString();
    }
    public String removeOuterParenthesesUsingStack(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuilder answer = new StringBuilder();
        int start =0, end=0;
        while(start<S.length()){
            stack.push(S.charAt(end++));
            while(!stack.empty()){
                if(S.charAt(end)=='('){
                    stack.push('(');
                     answer.append("(");
                } else {
                    stack.pop();
                    if(!stack.empty())
                    answer.append(")");
                }

                end++;
            }
            start = end;
        }
        return answer.toString();

    }
}
