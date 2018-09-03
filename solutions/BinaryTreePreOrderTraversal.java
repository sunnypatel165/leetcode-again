/*
Problem Statement:
Given a binary tree, return the preorder traversal of its nodes' values.

Problem Link:
    Binary Tree Preorder Traversal:https://leetcode.com/problems/binary-tree-preorder-traversal/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/BinryTreePreOrderTraversal.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
//////////////// RECURSIVE SOLUTION AT THE BOTTOM /////////////////
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
            return list;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node!=null){
                list.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        return list;
    }
    public List<Intger> preorderTraversalRecursive(TreeNode root){
        if(root==null)
            return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
 /*
class Solution {
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
            return list;
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
*/
