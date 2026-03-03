package org.example.DAY8;


//Longest Substring Without Repeating Characters

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

//Input: s = "zxyzxyz"
//Output: 3
public class P1 {

    public static void main(String[] args) {
        String s= "zxyzxyz";

        System.out.println(process(s));


    }
    public static int process(String s){

        Set<Character> set= new HashSet<>();
        int left =0,right= 0;

        int maxLength=0;
        int n = s.length();

        while(right< n){
            char ch = s.charAt(right);
            if(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            else {
                set.add(ch);
                maxLength=Math.max(maxLength, right-left +1);
                right++;
            }

        }
        return maxLength;

    }

}
