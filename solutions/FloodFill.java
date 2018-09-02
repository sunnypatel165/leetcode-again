/*
Problem Statement:
An image is represented by a 2-D array of integers, each integer representing the pixel value of the image (from 0 to 65535).

Given a coordinate (sr, sc) representing the starting pixel (row and column) of the flood fill, and a pixel value newColor, "flood fill" the image.

To perform a "flood fill", consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color as the starting pixel), and so on. Replace the color of all of the aforementioned pixels with the newColor.

At the end, return the modified image.

Problem Link:
    Flood Fill: https://leetcode.com/problems/flood-fill/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/FloodFill.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]!=newColor)
            floodFillDFS(image, sr,sc,image[sr][sc], newColor);
        return image;

    }
    public void floodFillDFS(int[][] image, int sr, int sc, int oldColor, int newColor){
        if( image[sr][sc]==oldColor){
            image[sr][sc]=newColor;

            if(sr-1 >=0)
                floodFillDFS(image, sr-1, sc, oldColor, newColor);

            if(sc-1 >= 0)
                 floodFillDFS(image, sr, sc-1, oldColor, newColor);

            if(sr+1 < image.length)
                 floodFillDFS(image, sr+1, sc, oldColor, newColor);


            if(sc+1 < image[0].length)
                 floodFillDFS(image, sr, sc+1, oldColor,newColor);

        }
    }
}
