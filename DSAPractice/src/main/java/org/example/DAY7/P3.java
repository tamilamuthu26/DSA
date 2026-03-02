package org.example.DAY7;

//an integer array was given and we should make the array strictly increasing
//with minimum number of operations.
//an operation is incrementing by one

//Input:  [1,2,3,4]
//Output: 0
//Input:  [1,1,2]
//Output: 2
//Input:  [3,2,1]
//Output: 6

public class P3 {
    public static void main(String[] args) {
        int[] arr= {3,4,1};
        System.out.println(process(arr));
    }
    public static int process(int arr[]){
        int op=0;
        for(int i =0;i< arr.length-1;i++){
            if(arr[i] >= arr[i+1]){
                int req= arr[i]+1;
                op+= req - arr[i+1];
                arr[i+1]= req;
            }
        }
        return op;
    }
}
