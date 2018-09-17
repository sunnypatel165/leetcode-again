/*
Problem Statement:
On a N * N grid, we place some 1 * 1 * 1 cubes.

Each value v = grid[i][j] represents a tower of v cubes placed on top of grid cell (i, j).

Return the total surface area of the resulting shapes.


Problem Link:
    Surface Area Of 3D Shapes: https://leetcode.com/problems/surface-area-of-3d-shapes/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/SurfaceAreaOf3DShapes.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
    public int surfaceArea(int[][] grid) {
        int answer = 0;
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid.length;j++){
                if(grid[i][j]>0)
                    answer += grid[i][j]*4 + 2; //Top of stack + bottom of stack + reminaing 4 at each level
                if(i!=0)
                    answer -= Math.min(grid[i][j], grid[i-1][j])*2; //find the cubes common to this cube from top
                if(j!=0)
                    answer -= Math.min(grid[i][j], grid[i][j-1])*2; // find the cubes common to this cube from left
            }
        }
        return answer;
    }
}
