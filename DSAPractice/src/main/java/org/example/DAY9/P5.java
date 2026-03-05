package org.example.DAY9;

import java.util.Arrays;
//rotate array
public class P5 {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};

        rotate(arr,2);

        System.out.println(Arrays.toString(arr));
    }

    public static void rotate(int[] arr, int k){

        int n = arr.length;

        k = k % n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }

    public static void reverse(int[] arr, int left, int right){

        while(left < right){

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
