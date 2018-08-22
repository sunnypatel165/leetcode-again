/*
Problem Statement:
X city opened a new cinema, many people would like to go to this cinema. The cinema also gives out a poster indicating the movies’ ratings and descriptions.
Please write a SQL query to output movies with an odd numbered ID and a description that is not 'boring'. Order the result by rating.

Problem Link:
    Not Boring Movies https://leetcode.com/problems/not-boring-movies/description/
    https://github.com/sunnypatel165/leetcode-again/blob/master/solutions/NotBoringMovies.sql

Author:
    Sunny Patel
    sunnypatel165@gmail.com
    https://github.com/sunnypatel165
    https://www.linkedin.com/in/sunnypatel165/

 */

 select * from cinema where (id%2) <> 0 and description!='boring'  order by rating desc
