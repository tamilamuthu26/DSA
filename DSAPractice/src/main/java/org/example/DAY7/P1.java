package org.example.DAY7;


import java.util.Arrays;
import java.util.Comparator;

//Days without an IPL match
//
//You are given the number of days available for conducting IPL matches. You are also given a 2D array of size n where, matches[i] = [start_i, end_i] represents the starting and ending days of a series of matches (inclusive).
//Return the count of days where the no matches are scheduled.
//        Note: The matches may overlap.
//
//Example 1:
//Input: days = 10, matches = [[5,7],[1,3],[9,10]]
//Output: 2
//Explanation:
//There is no match scheduled on the 4th and 8th days.
//
//Example 2:
//Input: days = 5, matches = [[2,4],[1,3]]
//Output: 1
//Explanation:
//There is no match scheduled on the 5th day.
public class P1
{
    public static void main(String[] args) {

        int[][] matches1 = {{5,7},{1,3},{9,10}};
        System.out.println(countDaysWithoutMatch(10, matches1)); // 2

        int[][] matches2 = {{2,4},{1,3}};
        System.out.println(countDaysWithoutMatch(5, matches2)); // 1
    }

    public static  int countDaysWithoutMatch(int n,int[][] a)
    {

        if(a==null || a.length==0){
            return n;
        }
        Arrays.sort(a, Comparator.comparing(b->b[0]));
        int s= 0;
        int startTime= a[0][0];
        int endTime=a[0][1];
        for(int i =1 ;i<a.length;i++) {
            int start = a[i][0];
            int end = a[i][1];
            if (start <= endTime) {
                endTime = Math.max(end, endTime);
            } else {
                s += endTime - startTime + 1;
                startTime = start;
                endTime = end;
            }
        }
        s+= endTime - startTime + 1;
        return n - s;
    }

}
