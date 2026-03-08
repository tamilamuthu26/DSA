package org.example.DAY12;

//Reverse digits of an integer.
public class P2 {
    public static int reverse(int num) {

        int reversed = 0;

        while (num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {

        int num = 1234;

        int result = reverse(num);

        System.out.println("Reversed number: " + result);
    }
}
