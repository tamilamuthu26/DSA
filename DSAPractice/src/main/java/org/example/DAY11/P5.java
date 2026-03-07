package org.example.DAY11;

import java.util.PriorityQueue;

//Find the kth largest elem//Probent in an array.
public class P5 {
    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {

            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};

        System.out.println(findKthLargest(nums, 2));
    }
}
