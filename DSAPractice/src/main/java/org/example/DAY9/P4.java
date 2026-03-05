package org.example.DAY9;

import java.util.Arrays;

//Move all 0s to the end of the array while maintaining the order of non-zero elements.
public class P4 {
    public static void main(String[] args) {

        int arr[] = {0,1,0,3,12};

        moveZeros(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeros(int[] arr){

        int index = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] != 0){

                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;

                index++;
            }
        }
    }
}
