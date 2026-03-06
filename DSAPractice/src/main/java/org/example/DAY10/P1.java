package org.example.DAY10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
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
//Example 2:
//
//Input: nums = [7,7], k = 1
//
//Output: [7]
//Constraints:
//
//        1 <= nums.length <= 10^4.
//        -1000 <= nums[i] <= 1000
//        1 <= k <= number of distinct elements in nums.

public class P1 {

    public static int[] topKFrequent(int[] nums, int k) {

        if (nums == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        if (k <= 0) {
            throw new IllegalArgumentException("k must be greater than 0");
        }


        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }


        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>((a, b) ->
                        frequencyMap.get(a) - frequencyMap.get(b));

        for (int num : frequencyMap.keySet()) {

            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }


        int[] result = new int[k];
        int index = 0;

        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll();
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,2,3,3,3};
        int k = 2;

        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }
}
