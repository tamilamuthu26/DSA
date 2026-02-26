package org.example.DAY3;

import java.util.Scanner;

//Check Palindrome String
public class P5 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int l=0,r=s.length()-1;
        boolean pal=true;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                pal=false;
                break;
            }
            l++;
            r--;
        }
        if(pal) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
