package org.example.DAY2;

import java.util.*;

//Top K Frequent Elements
//Solved
//        Medium
//Topics
//Company Tags
//Hints
//Given an integer array nums and an integer k, return the k most frequent elements within the array.
//
//The test cases are generated such that the answer is always unique.
//
//You may return the output in any order.
//
//        Example 1:
//
//Input: nums = [1,2,2,3,3,3], k = 2
//
//Output: [2,3]
public class P2 {

        public static int[] topKFrequent(int[] nums, int k) {
            Map<Integer, Integer> freq = new HashMap<>();
            for (int num : nums) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }

            PriorityQueue<Map.Entry<Integer, Integer>> pq =
                    new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                pq.offer(entry);
                if (pq.size() > k) {
                    pq.poll();
                }
            }

            int[] result = new int[k];
            int i = 0;
            while (!pq.isEmpty()) {
                result[i++] = pq.poll().getKey();
            }

            return result;
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 2, 3, 3, 3};
            int k = 2;

            int[] result = topKFrequent(nums, k);
            System.out.println(Arrays.toString(result));
        }

}
