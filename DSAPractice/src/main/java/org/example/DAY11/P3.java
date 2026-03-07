package org.example.DAY11;

import java.util.HashMap;
import java.util.Map;

//Given an integer array nums and an integer k,
//return the total number of continuous subarrays whose sum equals k.

public class P3 {

    public static int subarraySum(int[] nums, int k) {

        if (nums == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        Map<Integer, Integer> prefixMap = new HashMap<>();

        // prefix sum 0 occurs once (important for subarrays starting at index 0)
        prefixMap.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {

            prefixSum += num;

            if (prefixMap.containsKey(prefixSum - k)) {
                count += prefixMap.get(prefixSum - k);
            }

            prefixMap.put(prefixSum,
                    prefixMap.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        int k = 2;

        int result = subarraySum(nums, k);

        System.out.println("Number of subarrays with sum " + k + " = " + result);
    }
}