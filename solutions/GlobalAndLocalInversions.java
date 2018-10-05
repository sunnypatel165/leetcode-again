/*
Problem Statement:
We have some permutation A of [0, 1, ..., N - 1], where N is the length of A.
The number of (global) inversions is the number of i < j with 0 <= i < j < N and A[i] > A[j].
The number of local inversions is the number of i with 0 <= i < N and A[i] > A[i+1].
Return true if and only if the number of global inversions is equal to the number of local inversions.

Problem Link:
    Global And Local Inversions: https://leetcode.com/problems/global-and-local-inversions/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/GlobalAndLocalInversions.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 class Solution {
     public boolean isIdealPermutation(int[] A) {
         System.out.println(Arrays.toString(A));
         int temp[] = new int[A.length];
         int localInversions = getLocalInversions(A);
         int globalInversions = mergeSortAndCount(A, temp, 0, A.length-1 );
         //System.out.println(globalInversions + " " + localInversions);
         return globalInversions == localInversions;

     }
     public int getLocalInversions(int[] A){
         int localInversions = 0;
         for(int i =0;i<A.length-1;i++){
             if(A[i]>A[i+1]){
                 localInversions++;
             }
         }
         return localInversions;
     }
     public int mergeSortAndCount(int[] A, int[] temp, int low, int high){
         //System.out.println(low +" "+high);
         int inversions = 0;
         if(high > low){
             int mid = (low+high)/2;
             inversions += mergeSortAndCount(A, temp,low, mid);
             inversions += mergeSortAndCount(A, temp,mid+1, high);
             inversions += mergeAndCount(A, temp, low, mid+1, high);
         }
         return inversions;
     }
     public int mergeAndCount(int[] A, int[] temp, int low, int mid, int high){
         int l = low, m=mid, h=mid, k=l;
         int inversions = 0;
         while(l<=mid-1 && h<=high){
             if(A[l] <= A[h])
                 temp[k++] = A[l++];
             else {
                 temp[k++] = A[h++];
                 inversions += (mid-l);
             }
         }
         while(l<=mid-1)
             temp[k++]=A[l++];
         while(h<=high-1)
             temp[k++]=A[h++];
         for(int i =low;i<=high;i++){
             A[i]=temp[i];
         }
         return inversions;

     }
 }
