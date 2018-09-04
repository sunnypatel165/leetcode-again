/*
Problem Statement:

There are a total of n courses you have to take, labeled from 0 to n-1.
Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
Given the total number of courses and a list of prerequisite pairs, return the ordering of courses you should take to finish all courses.
There may be multiple correct orders, you just need to return one of them. If it is impossible to finish all courses, return an empty array.

Problem Link:
    Course Schedule 2: https://leetcode.com/problems/course-schedule-ii/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/CourseScheduleII.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */


 class Solution {
     int[] list;
     int pointer = 0;
     public int[] findOrder(int numCourses, int[][] prerequisites) {
         list = new int[numCourses];
         if(!topologicalSortUsingKahnsAlgortihm(numCourses, prerequisites))
             return new int[0];
         return list;
     }
     public boolean topologicalSortUsingKahnsAlgortihm(int numCourses, int[][] prerequisites){
         boolean[][] adj = new boolean[numCourses][numCourses];

         for(int i=0;i<prerequisites.length;i++)
             adj[prerequisites[i][1]][prerequisites[i][0]] = true;

         int degree[] = new int[numCourses];
         Queue<Integer> queue = new ArrayDeque<>();
         int visited =0 ;
         setupDegrees(adj, degree, queue);
         if(queue.isEmpty())
             return false;

         while(!queue.isEmpty()){
             int node = (int) queue.remove();
             visited++;
             list[pointer++] = node;
             decreaseDegreeOfNeighbors(adj, node, degree, queue);
         }
         if(visited==numCourses)
             return true;
         return false;
     }
     public void setupDegrees(boolean adj[][], int[] degree, Queue queue){
         for(int i=0;i<adj.length;i++){
             degree[i]=getDegree(adj, i);
             if(degree[i]==0){
                queue.add(i);
             }
         }
     }
     public int getDegree(boolean adj[][], int node){
         int degree =0;
         for(int i =0;i<adj.length;i++){
             if(adj[i][node] == true)
                 degree++;
         }
         return degree;
     }
     public void decreaseDegreeOfNeighbors(boolean adj[][], int node, int degree[], Queue queue){
         for(int i=0;i<adj.length;i++){
             if(adj[node][i]==true){
                 degree[i]--;
                 if(degree[i]==0){
                     queue.add(i);
                 }
             }
         }
     }
 }
