package org.example.DAY13;

import com.sun.tools.javac.Main;

import java.util.Arrays;

public class P1 {
    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;

        int left =0;
        int right=n-1;

        while(left< right){
            int sum = numbers[left]+ numbers[right];

            if(sum == target){
                return new int[]{left+1, right+1};
            }
            else if(sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] numbers= {1,2,4};
        int target = 3;
        P1 m= new P1();
        System.out.println(Arrays.toString(m.twoSum(numbers,target)));
    }
}
