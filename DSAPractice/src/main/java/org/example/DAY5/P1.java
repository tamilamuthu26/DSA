package org.example.DAY5;
//Given array containing numbers from 0 to n with one missing, find it.
public class P1 {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};

        System.out.println(findMissing(arr));
    }

    public static int findMissing(int[] arr) {
        int n = arr.length;

        int expected = n * (n + 1) / 2;
        int actual = 0;

        for (int num : arr) {
            actual += num;
        }

        return expected - actual;
    }
}
