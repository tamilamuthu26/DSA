package org.example.DAY1;

//BinarySearch
public class P5 {
    public static int search(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 2, 4, 6, 8};
        int target = 4;

        int result = search(nums, target);

        System.out.println(result);
    }
}
