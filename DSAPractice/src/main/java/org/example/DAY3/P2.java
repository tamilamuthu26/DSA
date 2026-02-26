package org.example.DAY3;

import java.util.Scanner;

//Check if Number is Prime
public class P2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("Not Prime");
            return;
        }
        boolean prime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }
        if(prime) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
