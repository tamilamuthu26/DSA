package org.example.DAY13;

public class P2 {
    public static void main(String[] args) {
        // Example 1
        double x1 = 2.00000;
        int n1 = 10;
        System.out.println("Example 1 Output: " + myPow(x1, n1));

        // Example 2
        double x2 = 2.10000;
        int n2 = 3;
        System.out.println("Example 2 Output: " + myPow(x2, n2));

        // Example 3
        double x3 = 2.00000;
        int n3 = -2;
        System.out.println("Example 3 Output: " + myPow(x3, n3));


    }

    public static double myPow(double x, int n){
        long power =n ;
        if(power <0){
            x=1/x;
            power= -power;
        }
        if( power ==0){
            return 1;
        }
        double half=myPow(x ,(int)power/2);
        if(power%2==0){
            return half*half;
        }
        else{
            return half*half*x;
        }
    }
}
