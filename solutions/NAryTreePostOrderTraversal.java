
/*
Problem Statement:
Given an n-ary tree, return the postorder traversal of its nodes' values.

Problem Link:
    N-Ary Tree Post Order Traversal: https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/NAryTreePostOrderTraversal.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    /*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        return postorderTravesal(root, list);
    }
    public List<Integer> postorderTravesal(Node root, List<Integer> list){
        if(root==null)
            return list;
        for(Node node: root.children)
            postorderTravesal(node, list);
        list.add(root.val);
        return list;
    }
}
