package org.example.DAY11;
//Given an array height, find two lines that together with the x-axis form a container that holds the maximum water.
//
//        Example:
//
//Input:
//height = [1,8,6,2,5,4,8,3,7]
//
//Output:49
public class P4 {

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;

        while (left < right) {

            int area = Math.min(height[left], height[right]) * (right - left);

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
}