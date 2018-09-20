/*
Problem Statement:
Given a positive integer, return its corresponding column title as appear in an Excel sheet.


Problem Link:
    Excel Sheet Column Title: https://leetcode.com/problems/excel-sheet-column-title/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/ExcelSheetColumnTitle.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
           return true;
        if(Math.abs(maxDepth(root.left) - maxDepth(root.right))>1)
            return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null && root.right == null){
            return 1;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }
}

class Solution {
    public String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();
        while(n>0){
            if(n%26==0){
                builder.append((char)('Z')+"");
                n--;
            }
            else
                builder.append((char)(n%26+'A'-1)+"");
            n/=26;
        }
        return builder.reverse().toString();
    }
}
