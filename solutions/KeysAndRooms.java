/*
Problem Statement:
Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as:
    a binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Problem Link:
    Keys and Rooms: https://leetcode.com/problems/keys-and-rooms/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/KeysAndRooms.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        /* //Iterative:
        //boolean[] visited = dfs(rooms, 0, rooms.size());
        //boolean[] visited = bfs(rooms, 0, rooms.size());
        */

        //Recursive
        boolean[] visited = new boolean[rooms.size()];
        dfsRecursive(rooms,0, visited);

        //Common step to both iterative and recursive
        return areAllVisited(visited);
    }
    public boolean[] bfs(List<List<Integer>> rooms, int source, int size){
        boolean visited[] = new boolean[size];
        Queue queue = new ArrayDeque();
        queue.add(0);
        visited[0]=true;
        while(!queue.isEmpty()){
            int node = (int)queue.remove();
            for(int i=0;i<rooms.get(node).size();i++){
                int neighbor = rooms.get(node).get(i);
                if(visited[neighbor]==false){
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
        return visited;
    }
    public boolean[] dfs(List<List<Integer>> rooms, int source, int size){
        boolean visited[] = new boolean[size];
        Stack stack = new Stack();
        stack.push(0);

        while(!stack.isEmpty()){
            int node = (int)stack.pop();
            if(visited[node]== false)
                visited[node] = true;
            for(int i=0;i<rooms.get(node).size();i++){
                int neighbor = rooms.get(node).get(i);
                if(visited[neighbor]==false){
                    stack.push(neighbor);
                }
            }
        }
        return visited;
    }
    public void dfsRecursive(List<List<Integer>> rooms, int node, boolean[] visited){
        visited[node] = true;
        for(int i=0;i<rooms.get(node).size();i++){
                int neighbor = rooms.get(node).get(i);
                if(visited[neighbor]==false){
                   dfsRecursive(rooms, neighbor, visited);
                }
            }
    }
    public boolean areAllVisited(boolean[] visited){
          for(int i=0;i<visited.length;i++){
            if(visited[i]==false)
                return false;
        }
        return true;
    }
}
