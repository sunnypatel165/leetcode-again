/*
Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

Problem:
    Flipping an Image: https://leetcode.com/problems/flipping-an-image/description/
Solution:
    https://github.com/sunnypatel165/leetcode-again/solutions/FlippingAnImage.java
Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
class Solution {
    /**
     * [invertImage inverts the matrix - 0s to 1s and 1s to 0s.]
     * @param  A [Matrix to be invered]
     * @return   [Inverted Matrix]
     */
    public int[][] invertImage(int[][] A) {
        for(int i =0;i<A.length;i++){
            for(int j =0;j<A[i].length;j++){
                A[i][j] = A[i][j]==1? 0:1;
            }
        }
        return A;
    }
    /**
     * [flipImage flips the rows of the matrix]
     * [0,0,1] when flipped horizontally produces [1,0,0]
     * @param  A [Matrix to be Flipped]
     * @return   [Flipped Matrix]
     */
    public int[][] flipImage(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j =0;j<A[i].length/2;j++){
                int temp = A[i][j];
                A[i][j] = A[i][A.length-j-1];
                A[i][A.length - j - 1] = temp;
            }
        }
        return A;
    }
    public int[][] flipAndInvertImage(int[][] A) {
        return invertImage(flipImage(A));
    }
}
