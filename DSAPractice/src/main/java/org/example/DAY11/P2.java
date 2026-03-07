package org.example.DAY11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Given a collection of intervals, merge overlapping intervals.
//
//        Input:
//        [[1,3],[2,6],[8,10],[15,18]]
//
//Output:[[1,6],[8,10],[15,18]]
public class P2 {
    public static int[][] merge(int[][] intervals) {

        if (intervals == null || intervals.length == 0) {
            throw new IllegalArgumentException("Intervals cannot be empty");
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();

        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= current[1]) {
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                result.add(current);
                current = intervals[i];
            }
        }

        result.add(current);

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {

        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };

        int[][] merged = merge(intervals);

        System.out.println("Merged Intervals:");

        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
