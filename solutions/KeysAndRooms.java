/*
Problem Statement:
There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1, and each room may have some keys to access the next room.
Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where N = rooms.length.  A key rooms[i][j] = v opens the room with number v.
Initially, all the rooms start locked (except for room 0).
You can walk back and forth between rooms freely.
Return true if and only if you can enter every room.

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
