package org.example.DAY12;

//Every element appears twice except one.
//Return that single element.
public class P5 {
    public static int findSingleNumber(int[] nums) {

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int result = 0;

        for (int num : nums) {
            result = result ^ num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {4, 1, 2, 1, 2};

        int single = findSingleNumber(nums);

        System.out.println("Single element: " + single);
    }
}
