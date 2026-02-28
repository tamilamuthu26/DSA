package org.example.DAY5;
//gcd
public class P4 {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        System.out.println(gcd(a, b));
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
