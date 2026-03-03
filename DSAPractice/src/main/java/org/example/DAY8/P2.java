package org.example.DAY8;


import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

//subset
public class P2 {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(process(nums));
    }
    public static List<List<Integer>> process(int[] arr){
        List<List<Integer>> result= new ArrayList<>();
        result.add(new ArrayList<>());

        for(int n: arr){

            int size= result.size();

            for(int i =0;i< size;i++){
                List<Integer> subset= new ArrayList<>(result.get(i));
                subset.add(n);
                result.add(subset);
            }
        }
        return result;

    }
}
