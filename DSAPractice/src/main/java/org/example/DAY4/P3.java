package org.example.DAY4;
//
//2.Given an binary array nums and an integer k, return true if all 1's are
// at least k places away from each other, otherwise return false.
//Input: nums = [1,0,0,0,1,0,0,1], k = 2
//Output: true
//Explanation: Each of the 1s are at least 2 places away from each other.

//Input: nums = [1,0,0,1,0,1], k = 2
//Output: false
//Explanation: The second 1 and third 1 are only one apart from each other.


public class P3 {
    public static void main(String[] args) {
        int arr[]= {1,0,0,0,1,0,0,1};
        int k=2;
        System.out.println(process(arr,k));
    }
    public static boolean process(int arr[],int k){

        int n = arr.length;

        int lastIndex=-1;
        for(int i =0;i<n;i++){

            if(arr[i]==1) {

                if (lastIndex != -1) {
                    if (i - lastIndex - 1 < k) {
                        return false;
                    }
                }
                lastIndex = i;
            }
        }
        return true;
    }
}
