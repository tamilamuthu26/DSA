package org.example.DAY6;
//Print first n Fibonacci numbers.
public class P4 {
    public static void main(String[] args) {
        int n = 7;
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
