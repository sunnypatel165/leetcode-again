/*
Problem Statement:
In this problem, a tree is an undirected graph that is connected and has no cycles.
The given input is a graph that started as a tree with N nodes (with distinct values 1, 2, ..., N), with one additional edge added. The added edge has two different vertices chosen from 1 to N, and was not an edge that already existed.
The resulting graph is given as a 2D-array of edges. Each element of edges is a pair [u, v] with u < v, that represents an undirected edge connecting nodes u and v.
Return an edge that can be removed so that the resulting graph is a tree of N nodes. If there are multiple answers, return the answer that occurs last in the given 2D-array. The answer edge [u, v] should be in the same format, with u < v.

Problem Link:
    Assign Cookies: https://leetcode.com/problems/redundant-connection/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/RedundantConnection.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent  = new int[edges.length+1];
        int [] answer = new int[2];
        for(int i=0;i<parent.length;i++){
            parent[i]=-1;
        }
        for(int i=0;i<edges.length;i++){
            int x = find(parent, edges[i][0]);
            int y = find(parent, edges[i][1]);

            if(x==y)
                answer = edges[i];
            else
                union(parent, x, y);
        }
        System.out.println(Arrays.toString(parent));
        return answer;
    }
    public int find(int parent[], int component){
        if(parent[component]==-1)
            return component;
        return find(parent, parent[component]);
    }
    public void union(int parent[], int component1, int component2){
        int set1 = find(parent, component1);
        int set2 = find(parent, component2);
        parent[set1]=set2;
    }
}
