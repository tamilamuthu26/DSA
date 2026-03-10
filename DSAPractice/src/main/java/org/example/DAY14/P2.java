package org.example.DAY14;

import java.util.Arrays;
import java.util.Stack;

//For each day, find how many days you have to wait for a warmer temperature.
//
//        Example
//
//Input:  [73,74,75,71,69,72,76,73]
//Output: [1,1,4,2,1,1,0,0]
public class P2 {
    public static int[] dailyTemperatures(int[] temps) {

        int n = temps.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){

            while(!stack.isEmpty() && temps[i] > temps[stack.peek()]){

                int prev = stack.pop();
                result[prev] = i - prev;
            }

            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] temps = {73,74,75,71,69,72,76,73};

        System.out.println(Arrays.toString(dailyTemperatures(temps)));
    }


}
