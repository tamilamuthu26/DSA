package org.example.DAY6;

//Check if a number is Armstrong (e.g., 153).
//Sum of cube of digits equals number.
public class P1
{
    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));
    }

    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n /= 10;
        }

        return sum == original;
    }
}
