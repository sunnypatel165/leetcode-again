/*
Problem Statement:
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
Note: A leaf is a node with no children.

Problem Link:
    Minimum Depth of a Binary Tree: https://leetcode.com/problems/minimum-depth-of-binary-tree/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/MinimumDepthOfABinaryTree.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public int minDepth(TreeNode root) {
        return minDepthIterative(root);
        // return minDepthRecursive(root);
    }
    public int minDepthIterative(TreeNode root) {
        if(root==null){
            return 0;
        }
        int min = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i =0;i<size;i++){
                TreeNode t= queue.remove();
                if(t.left==null && t.right==null){
                    return min;
                }
                if(t.left!=null){
                    queue.add(t.left);
                }
                if(t.right!=null){
                    queue.add(t.right);
                }
            }
            min++;
        }
        return 0;
    }
    public int minDepthRecursive(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left==0 || right ==0 ){
            return left + right + 1;
        }
        return 1+ Math.min(left, right);
    }
    public int minDepthRecursiveOriginal(TreeNode root){
        if(root==null)
            return 0;
        if(root.left==null && root.right == null)
            return 1;
        if(root.left==null)
            return 1+minDepth(root.right);
        if(root.right==null)
            return 1+minDepth(root.left);
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
