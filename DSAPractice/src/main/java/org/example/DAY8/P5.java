package org.example.DAY8;


//Linear search
public class P5 {

        public static void main(String[] args) {

            int[] arr = {10, 25, 30, 45, 50};
            int target = 30;

            int index = linearSearch(arr, target);

            if (index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found");
            }
        }

        public static int linearSearch(int[] arr, int target) {

            if (arr == null) {
                throw new IllegalArgumentException("Array cannot be null");
            }

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }
}
