/*
Problem Statement:
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).
Find the minimum element.
The array may contain duplicates.

Problem Link:
    Find Minimum In A Rotated Sorted Array II:https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/FindMinimumInARotatedSortedArrayII.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     public int findMin(int[] nums) {
         return findMinUsingLinearSearch(nums);
         //return findMinUsingBinarySearch(nums);

     }
     public int findMinUsingLinearSearch(int[] nums){
         int i =0;
         while((i+1)<=nums.length-1 && nums[i] <= nums[i+1] )
             i++;
         if(i==nums.length-1)
             return nums[0];
         return nums[i+1];
     }
     public int findMinUsingBinarySearch(int[] nums){
         if(nums.length==1)
             return nums[0];
         if(nums.length==2)
             return Math.min(nums[0], nums[1]);
         int start = 0;
         int end = nums.length-1;
         int mid = (start+end)/2;
         if(nums[end] > nums[0])
             return nums[0];
         while(start <= end && start>=0 && end<=nums.length){
             if(nums[mid] > nums[mid+1])
                 return nums[mid+1];
             if(nums[mid-1] > nums[mid])
                 return nums[mid];
             if(nums[start] < nums[mid])
                 start = mid+1;
             else if(nums[start] > nums[mid])
                 end = mid - 1;
             mid = start+(end-start)/2;
         }
         return -1;
     }
 }
