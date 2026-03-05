package org.example.DAY7;

import java.util.PriorityQueue;

//Input: nums = [1,1,2,4,9], k = 20
//Output: 4
//
//You are given an array of integers (nums), and an integer k.
//
//You are allowed to perform an operation on nums:
//        • Select the two smallest integers x and y from nums.
//        • Remove x and y from nums.
//        • Insert (min(x, y) * 2 + max(x, y)) at any position in the array.
//
//Return the minimum number of operations needed so that all elements
// of the array are greater than or equal to k.
//
//        Example 1:
//Input: nums = [1,1,2,4,9], k = 20
//Output: 4
//
//Example 2:
//Input: nums = [2,11,10,1,3], k = 10
//Output: 2
public class P2 {

    public static void main(String[] args) {

        int[] a={1,1,2,4,9};
        int k =20;
        System.out.println(process(a,k));
        int[] nums2 = {2,11,10,1,3};
        System.out.println(process(nums2, 10));
    }

    public static int process(int[] arr, int k){
        if( arr == null || arr.length==0){
            throw new IllegalArgumentException("Input array is empty");
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int m: arr){
            pq.offer(m);
        }
        int op= 0;
        while (!pq.isEmpty() && pq.peek()<k){
            if (pq.size() < 2) {
                return -1; //impossible
            }
            int x= pq.poll();
            int y=pq.poll();             //Input: nums = [1,1,2,4,9], k = 20
            int newVal= (x * 2)+ y;      //Output: 4
            pq.offer(newVal);            //Input: nums = [2,11,10,1,3], k = 10
            op++;                        //Output: 2
        }
        return  op;
    }

}
