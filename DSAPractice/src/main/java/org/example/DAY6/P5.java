package org.example.DAY6;

//Find factorial of a given number n.
public class P5 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
