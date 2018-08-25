/*
Problem Statement:
You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2. Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, output -1 for this number.

Problem Link:
    Next Greater Element: https://leetcode.com/problems/next-greater-element-i/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/NextGreaterElement1.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1.length==0 || nums2.length==0)
            return new int[0];
        int answer[] = new int[nums1.length];
        Map<Integer, Integer> map = getNextGreaterUsingStack(nums2);
        for(int i =0;i<nums1.length;i++){
            answer[i]=map.getOrDefault(nums1[i], -1);
        }
        return answer;
    }
    public Map<Integer, Integer> getNextGreaterUsingStack(int[] nums){
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
                if(stack.isEmpty())
                    stack.push(nums[i]);
                else if(stack.peek() > nums[i])
                    stack.push(nums[i]);
                else if(stack.peek() < nums[i]){
                    while( !stack.isEmpty() && stack.peek() < nums[i] ){
                        map.put(stack.pop(), nums[i]);
                    }
                    stack.push(nums[i]);
                }
        }
        return map;
    }
    public Map<Integer, Integer> getNextGreater(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[nums.length-1], -1);
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j]){
                    map.put(nums[i], nums[j]);
                    break;
                }
            }
        }
        return map;
    }
}
