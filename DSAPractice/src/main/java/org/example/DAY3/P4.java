package org.example.DAY3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Count Frequency of Characters
public class P4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+"-"+e.getValue());
        }
    }
}
