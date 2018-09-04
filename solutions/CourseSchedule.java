/*
Problem Statement:
There are a total of n courses you have to take, labeled from 0 to n-1.
Some courses may have prerequisites, for example to take course 0 you have to first take course 1, which is expressed as a pair: [0,1]
Given the total number of courses and a list of prerequisite pairs, is it possible for you to finish all courses?

Problem Link:
    Course Schedule:https://leetcode.com/problems/course-schedule/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/CourseSchedule.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 class Solution {
     public boolean canFinish(int numCourses, int[][] prerequisites) {
         return topologicalSortUsingKahnsAlgortihm(numCourses, prerequisites);
     }

     /* Kahns Algorithm:
         - Find Degrees of Each node in the graph and add the ones with 0 degree to the queue, Visited 0
            - Pick the node with degree 0
            - Increment Visited and decrease degree of each neighbor by 1
            - If any neighbor's degree becomes 0 then add it to the queue
         - If at any point the queue is empty but visited!=numberOfNodes then Toplogical Order does not exist


     */
     public boolean topologicalSortUsingKahnsAlgortihm(int numCourses, int[][] prerequisites){
         boolean[][] adj = new boolean[numCourses][numCourses];

         for(int i=0;i<prerequisites.length;i++)
             adj[prerequisites[i][0]][prerequisites[i][1]] = true;

         int degree[] = new int[numCourses];
         Queue<Integer> queue = new ArrayDeque<>();
         int visited =0 ;
         setupDegrees(adj, degree, queue);
         if(queue.isEmpty())
             return false;

         while(!queue.isEmpty()){
             int node = (int) queue.remove();
             visited++;
             decreaseDegreeOfNeighbors(adj, node, degree, queue);
         }
         if(visited==numCourses)
             return true;
         return false;
     }
     public void setupDegrees(boolean adj[][], int[] degree, Queue queue){
         for(int i=0;i<adj.length;i++){
             degree[i]=getDegree(adj, i);
             if(degree[i]==0)
                queue.add(i);
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
