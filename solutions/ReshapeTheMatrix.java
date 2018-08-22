/*
Problem Statement:
In MATLAB, there is a very useful function called 'reshape', which can reshape a matrix into a new one with different size but keep its original data.
You're given a matrix represented by a two-dimensional array, and two positive integers r and c representing the row number and column number of the wanted reshaped matrix, respectively.
The reshaped matrix need to be filled with all the elements of the original matrix in the same row-traversing order as they were.
If the 'reshape' operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.

Problem Link:
    Reshape The Matrix: https://leetcode.com/problems/reshape-the-matrix/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/ReshapeTheMatrix.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     /*
     A very simple solution: Traverse both new and old matrices together.
     Keep two pointers - i, j - for new matrix's Row and column
     Keep two pointers - iOriginal, jOriginal - for original matrix's Row and column
      */
     public int[][] matrixReshape(int[][] nums, int r, int c) {
         int rOriginal = nums.length;
         int cOriginal = nums[0].length;

         //If not possible to reshape, return original
         if(rOriginal * cOriginal != r*c)
             return nums;

         int answer[][] = new int[r][];
         int iOriginal =0,jOriginal=0;

         for(int i =0;i<r ;i++){
             answer[i]= new int[c];
             for(int j =0;j<c ;j++){
                 //Copy the current element
                 answer[i][j]=nums[iOriginal][jOriginal];

                 //Slide the column pointer to right
                 jOriginal++;

                 //If already at the right end, slide to left and go to next row.
                 if(jOriginal >= cOriginal)
                 {
                     iOriginal++;
                     jOriginal=0;
                 }
             }
         }
         return answer;

     }
 }
