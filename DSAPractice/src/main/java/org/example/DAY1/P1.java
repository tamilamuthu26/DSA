package org.example.DAY1;

//Contains Duplicate
//
//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
//
//Example 1:
//
//Input: nums = [1, 2, 3, 3]
//
//Output: true
//
//Example 2:
//
//Input: nums = [1, 2, 3, 4]
//
//Output: false


import java.util.HashSet;
import java.util.Set;

public class P1 {
    public static void main(String[] args) {

        int[] nums= {1,2,455,66,22,11,22};

        if(checkDuplicates(nums)){
            System.out.println("No duplicates");
        }else{
            System.out.println("Contains duplicates");
        }



    }
    private  static boolean checkDuplicates(int nums[]){

        Set<Integer> set= new HashSet<>();
        for(int n: nums){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
        }
        return true;

    }
}