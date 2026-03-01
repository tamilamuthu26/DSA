package org.example.DAY6;

import java.util.HashSet;
import java.util.Set;

//Find duplicate element in array (one duplicate assumed).
public class P2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};

        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num))
                return num;
            set.add(num);
        }

        return -1;
    }
}
