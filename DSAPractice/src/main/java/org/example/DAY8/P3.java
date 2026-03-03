package org.example.DAY8;


//Given an integer, return the sum of its digits.
//Example:
//Input: 1234 → Output: 10
public class P3 {
    public static void main(String[] args) {

        int number = 1234;
        int result = sumDigits(number);
        System.out.println("Sum of Digits: " + result);
    }

    public static int sumDigits(int number) {

        int sum = 0;
        number = Math.abs(number); // handle negative numbers
        while (number > 0) {

            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
