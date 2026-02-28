package org.example.DAY5;

//Return true if number is power of 2.
public class P5 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
