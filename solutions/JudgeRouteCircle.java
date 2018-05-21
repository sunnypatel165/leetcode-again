/*
Problem Statement:
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Problem Link:
    Judge Route Circle: https://leetcode.com/problems/judge-route-circle/description/

Solution:
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/JudgeRouteCircle.java

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */
 class Solution {
     /**
      * Method to move the point in the given direction
      * @param  point     [Point to be moved]
      * @param  direction [Direction in which Point is to be moved]
      * @return           [Final position of the moved point]
      */
    public Point move(Point point, char direction){
        if(point == null || (direction!='U' && direction!='D' && direction!='L' && direction!='R'))
            return point;
        switch (direction){
            case 'U':
                point.setY(point.getY()+1);
                break;
            case 'D':
                point.setY(point.getY()-1);
                break;
            case 'L':
                point.setX(point.getX()-1);
                break;
            case 'R':
                point.setX(point.getX()+1);
        }
        return point;
    }
    /**
     * [judgeCircle description]
     * @param  moves [String representing moves]
     * @return       [If the moves lead to a circle or not.]
     */
    public boolean judgeCircle(String moves) {
        Point point = new Point(0,0);
        for(int i=0;i<moves.length();i++){
            point = move(point, moves.charAt(i));
        }
       return point.isOrigin();
    }
}
class Point{
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean isOrigin(){
        return this.getX()==0 && this.getY()==0;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
}
