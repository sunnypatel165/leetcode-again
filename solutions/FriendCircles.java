/*
Problem Statement:
There are N students in a class. Some of them are friends, while some are not. Their friendship is transitive in nature. For example, if A is a direct friend of B, and B is a direct friend of C, then A is an indirect friend of C. And we defined a friend circle is a group of students who are direct or indirect friends.
Given a N*N matrix M representing the friend relationship between students in the class. If M[i][j] = 1, then the ith and jth students are direct friends with each other, otherwise not. And you have to output the total number of friend circles among all the students.

Problem Link:
    Friend Circles:  https://leetcode.com/problems/friend-circles/description/
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/FriendCircles.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    int answer =0;
    public int findCircleNum(int[][] M) {
       return findCircleNumUsingDfs(M);
       //return findCircleNumUsingUnionFind(M);

    }

    /////////////////////Depth First Search////////////////////
    public int findCircleNumUsingDfs(int[][] M){
        boolean visited[]= new boolean[M.length];
        for(int i =0;i<M.length;i++){
            if(visited[i]==false){
                dfs(M, i, visited);
                answer++;
            }
        }
        return answer;
    }
    public void dfs(int M[][], int node, boolean[] visited){
        visited[node]=true;
        for(int i=0;i<M.length;i++){
            if(i!=node && M[i][node]==1){
                if(visited[i]==false)
                    dfs(M, i, visited);
            }
        }
    }
    /////////////////////Union Find////////////////////
    public int findCircleNumUsingUnionFind(int[][] M){
        answer =M.length;
        int[] parent  = new int[M.length];

        for(int i=0;i<parent.length;i++){
            parent[i]=-1;
        }
        for(int i=0;i<M.length;i++){
            int x=-1, y=-1;
            for(int j =0;j<M.length;j++){
                if(M[i][j]==1 && i!=j){
                    union(parent, i, j);
                }
            }
        }
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
        if(set1==set2)
            return;
        parent[set1]=set2;
        answer--;
    }

}
