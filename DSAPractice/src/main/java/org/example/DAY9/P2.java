package org.example.DAY9;

import java.util.HashMap;
import java.util.Map;

//1.Problem : Two sum
//
//Given:
//
//An array nums = [1,2,4]
//
//and a target = 6
//
//Expected Output : [1,2]
//
//Because  nums[1]+nums[2] = 2+4 = 6
public class P2 {

    public static void main(String[] args) {
        int arr[]={1,2,4};
        int target= 6;

        int res[]=process(arr,target);

        System.out.println(res[0]+","+res[1]);
    }
    public static int[] process(int[] arr, int target){
        Map<Integer,Integer> map= new HashMap();
        int n = arr.length;

        for(int i =0;i<n;i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(arr[i],i);

        }

        return new int[0];
    }
}
