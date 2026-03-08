package org.example.DAY12;

import java.util.HashMap;

//Given an array nums and an integer k, return the total number
// of continuous subarrays whose sum equals k.
public class P4 {
    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int num : nums) {

            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1};
        int k = 2;

        int result = subarraySum(nums, k);

        System.out.println("Subarrays count: " + result);
    }
}
