package org.example.DAY14;

import com.sun.jdi.PathSearchingVirtualMachine;

public class P1 {
    public static int maxArea(int[] heights) {
        int n= heights.length;
        int maxArea= 0,h=heights[0];
        for(int i =0;i <n;i++){
            for(int j =i+1;j<n;j++){
                h= Math.min(heights[i],heights[j]);
                int w= j-i;

                int area= h*w;
                maxArea= Math.max(area, maxArea);
            }
        }
        return maxArea;

    }

    public static void main(String[] args) {
        int h[]= {2,2,2};
        System.out.println(maxArea(h));
    }
}
