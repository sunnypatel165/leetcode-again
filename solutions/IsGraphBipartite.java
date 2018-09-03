/*
Problem Statement:
Given an undirected graph, return true if and only if it is bipartite.
Recall that a graph is bipartite if we can split it's set of nodes into two independent subsets A and B such that every edge in the graph has one node in A and another node in B.
The graph is given in the following form: graph[i] is a list of indexes j for which the edge between nodes i and j exists.
Each node is an integer between 0 and graph.length - 1.
There are no self edges or parallel edges: graph[i] does not contain i, and it doesn't contain any element twice.

Problem Link:
    Is Graph Bipartite: https://leetcode.com/problems/is-graph-bipartite/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/IsGraphBipartite.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public boolean isBipartite(int[][] graph) {
         int[] color = new int[graph.length];
         for(int j =0;j<color.length;j++){
             if(color[j]==0){
                  if( ! isBipartite(graph, color, j))
                      return false;
             }
         }
         return true;
     }
     public boolean isBipartite(int[][] graph, int color[],  int source){
         Queue queue = new ArrayDeque();
         queue.add(source);
         color[source] = 1;
         while(!queue.isEmpty()){
             int node = (int)queue.remove();
             for(int i =0;i<graph[node].length;i++){
                 int neighbor = graph[node][i];

                 //If not colored then add to the queue
                 if(color[neighbor]==0)
                     queue.add(neighbor);

                 //If colored same as neighbor - then not a bipartite
                 if(color[node] == color[neighbor]){
                     return false;
                 }

                 //Else assign a different color
                 if(color[node]==1)
                     color[neighbor]=2;
                 else
                     color[neighbor]=1;
             }
         }
         return true;
     }
 }
