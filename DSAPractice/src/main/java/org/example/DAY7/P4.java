package org.example.DAY7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//
//
//Problem Statement:
//Given a list of student test scores, find the best average grade.
//Each student may have more than one test score in the list.
//Complete the bestAverageGrade function in the editor below.
//It has one parameter, scores, which is an array of student test scores.
//Each element in the array is a two-element array of the form [student name, test score]
//e.g. [ "Bobby", "87" ].
//Test scores may be positive or negative integers.
//If you end up with an average grade that is not an integer, you should
//use a floor function to return the largest integer less than or equal to the average.
//Return 0 for an empty input.
//        Example:
//Input:
//        [ [ "Bobby", "87" ],
//        [ "Charles", "100" ],
//        [ "Eric", "64" ],
//        [ "Charles", "22" ] ].
//Expected output: 87
//Explanation: The average scores are 87, 61, and 64 for Bobby, Charles, and Eric,
//respectively. 87 is the highest.
//        Signatue:
//public static Integer bestAverageGrade(String[][] scores) {
//}
//Test Cases:
//Input :
//        {{"Sarah", "91"},
//        {"Goldie", "92"},
//        {"Elaine", "93"},
//        {"Elaine", "95"},
//        {"Goldie", "94"},
//        {"Sarah", "93"}}
//Output: 94
public class P4 {
    public static void main(String[] args) {

        String[][] input = {
                {"Sarah", "91"},
                {"Goldie", "92"},
                {"Elaine", "93"},
                {"Elaine", "95"},
                {"Goldie", "94"},
                {"Sarah", "93"}
        };

        System.out.println(process(input));

        List<Map.Entry<String, Integer>> m = List.of(
                Map.entry("Sarah", 91),
                Map.entry("Goldie", 92),
                Map.entry("Elaine", 93),
                Map.entry("Elaine", 95),
                Map.entry("Goldie", 93),
                Map.entry("Sarah", 93)
        );
//
//        int i = m.stream()
//                .collect(Collectors.groupingBy(m1->m1.getKey(),
//                        Collectors.averagingInt(m1->m1.getValue())))
//                .values()
//                .stream()
//                .mapToInt(Double::intValue)
//                .max()
//                .getAsInt();

        double i = Arrays.stream(input)
                .collect(Collectors.groupingBy(a -> a[0],
                        Collectors.averagingInt(a -> Integer.parseInt(a[1]))))

                .values()
                .stream().mapToDouble(Double::doubleValue).max().getAsDouble();

                System.out.println(i);

    }

    public static int process(String arr[][]) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        Map<String, Integer> sumMap = new HashMap<>();
        Map<String, Integer> countMap = new HashMap<>();
        for (String[] a : arr) {
            String name = a[0];
            int score = Integer.parseInt(a[1]);
            sumMap.put(name, sumMap.getOrDefault(name, 0) + score);
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
        }
        int maxAverage = Integer.MIN_VALUE;
        for (String s : sumMap.keySet()) {
            int sum = sumMap.get(s);
            int count = countMap.get(s);
            int average = sum / count;
            maxAverage = Math.max(average, maxAverage);
        }
        return maxAverage;
    }
}
