package org.example.DAY1;

import java.util.Arrays;
import java.util.HashMap;

public class P2 {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int res= target - nums[i];
            if(map.containsKey(res)){
                int j = map.get(res);
                return new int[]{Math.min(i,j),Math.max(i,j)};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int target = 7;
        try {
            int[] result = twoSum(nums, target);
            System.out.println("Indices: " + Arrays.toString(result));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
