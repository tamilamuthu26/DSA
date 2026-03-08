package org.example.DAY12;
//Jump game
public class P1 {
    public static boolean canJump(int[] nums) {

        if (nums == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        if (nums.length == 0) {
            return false;
        }

        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            // If current index is unreachable
            if (i > maxReach) {
                return false;
            }

            // Update the farthest reachable index
            maxReach = Math.max(maxReach, i + nums[i]);

            // Early exit if last index reachable
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] nums1 = {2,3,1,1,4};
        int[] nums2 = {3,2,1,0,4};

        System.out.println(canJump(nums1)); // true
        System.out.println(canJump(nums2)); // false
    }
}
