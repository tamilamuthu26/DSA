package org.example.DAY6;

//Find sum of digits of an integer.
public class P3 {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sumOfDigits(n));
    }

    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
