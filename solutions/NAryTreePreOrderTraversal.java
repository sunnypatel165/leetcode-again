
/*
Problem Statement:
Given an n-ary tree, return the preorder traversal of its nodes' values.

Problem Link:
    N-Ary Tree Pre Order Traversal:https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/NAryTreePostOrderTraversal.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        return preorderTravesal(root, list);
        //return list;
    }
    public List<Integer> preorderTravesal(Node root, List<Integer> list){
        if(root==null)
            return list;

        list.add(root.val);
        for(Node node: root.children)
            preorderTravesal(node, list);
        return list;
    }
}
