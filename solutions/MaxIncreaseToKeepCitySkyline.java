/*
Problem Statement:

In a 2 dimensional array grid, each value grid[i][j] represents the height of a building located there. We are allowed to increase the height of any number of buildings, by any amount (the amounts can be different for different buildings). Height 0 is considered to be a building as well.
At the end, the "skyline" when viewed from all four directions of the grid, i.e. top, bottom, left, and right, must be the same as the skyline of the original grid. A city's skyline is the outer contour of the rectangles formed by all the buildings when viewed from a distance. See the following example.
What is the maximum total sum that the height of the buildings can be increased?

Problem Link:
    Judge Route Circle: https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/MaxIncreaseToKeepCitySkyline.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

class Solution {
    /*
    How much can the height of a building be increased?
        - UPTO the maximum height building for this row
        - UPTO the maximum height building for this column.

    But what if the maxmium height for row and column is not the same?
    We will need to pick the minimum between the two!

    So we maintain 2 arrays - rowMax and colMax - representing the maxium for each row and each column
    The final answer is (min(rowMax[i], colMax[i])) for each i
    This number represents the maxmium possible increase in the height of any building, keeping the skyline same!
     */
    int rowMax[] = new int[51];
    int colMax[] = new int[51];

  /**
   * [maxIncreaseKeepingSkyline finds the maximum possible increase keeping the skyline]
   * @param  grid [grid denoting city skylines]
   * @return      [Integer denoting the maxmium possible increase in the skyline]
   */
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        findRowMax(grid);
        findColMax(grid);
        return getMaxIncreaseKeepingSkyline(grid);
    }
    /**
     * [findRowMax Finds the maximum height for each row]
     * @param grid [grid denoting city skylines]
     */
      public void findRowMax(int[][] grid){
        for(int i=0;i<grid.length;i++){
            int rMax = -1;
            for(int j =0;j<grid.length;j++){
                if(rMax < grid[i][j])
                    rMax = grid[i][j];
            }
            rowMax[i] = rMax;
        }
    }
    /**
     * [findColMax Finds the maximum height for each column]
     * @param grid [grid denoting city skylines]
     */
    public void findColMax(int[][] grid){
        for(int i=0;i<grid.length;i++){
            int cMax = -1;
            for(int j =0;j<grid.length;j++){
                if(cMax < grid[j][i])
                    cMax = grid[j][i];
            }
            colMax[i] = cMax;
        }
    }
    /**
     * [getMaxIncreaseKeepingSkyline Finds the maximum possible increase in the height of each building]
     * @param  int[][]grid [grid denoting city skyline]
     * @return             [the maxmimum possible increase in the skyline]
     */
    public int getMaxIncreaseKeepingSkyline(int[][]grid){
        int answer = 0;
        for(int i=0;i<grid.length;i++){
            for(int j =0;j<grid.length;j++){
                answer += Math.min(rowMax[i],colMax[j])-grid[i][j];
            }
        }
        return answer;
    }
}
