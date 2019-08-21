/*
Problem Statement:

You are given a data structure of employee information, which includes the employee's unique id, his importance value and his direct subordinates' id.
For example, employee 1 is the leader of employee 2, and employee 2 is the leader of employee 3. They have importance value 15, 10 and 5, respectively. Then employee 1 has a data structure like [1, 15, [2]], and employee 2 has [2, 10, [3]], and employee 3 has [3, 5, []]. Note that although employee 3 is also a subordinate of employee 1, the relationship is not direct.
Now given the employee information of a company, and an employee id, you need to return the total importance value of this employee and all his subordinates.

Problem Link:
    EmployeeImportance: https://leetcode.com/problems/employee-importance/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/EmployeeImportance.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     Map<Integer, Employee> idToEmployee = new HashMap<>();
     public int getImportance(List<Employee> employees, int id) {
         for(Employee e: employees){
             idToEmployee.put(e.id, e);
         }
        return getImportanceDFS(employees, id);
         // return getImportanceBFS(employees,id);
     }
     public int getImportanceDFS(List<Employee> employees, int id){
         Employee e = idToEmployee.get(id);
         int totalImportance =e.importance;
         for(int i: e.subordinates){
             totalImportance += getImportanceDFS(employees, i);
         }
         return totalImportance;
     }
     public int getImportanceBFS(List<Employee> employees, int id) {
         Stack<Employee> stack = new Stack<>();
         stack.push(idToEmployee.get(id));
         int totalImportance = 0;
         while(!stack.isEmpty()){
             Employee e = stack.pop();
             totalImportance += e.importance;
             for(int i:e.subordinates){
                 stack.push(idToEmployee.get(i));
             }
         }
         return totalImportance;
     }
 }
