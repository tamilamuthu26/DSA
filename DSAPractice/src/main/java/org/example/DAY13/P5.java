package org.example.DAY13;
//Given an array where prices[i] is the stock price on day i,
//find the maximum profit.
//
//Example
//
//Input: [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy at 1 and sell at 6
public class P5 {
    public static int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){

            if(price < minPrice){
                minPrice = price;
            }
            else if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7,1,5,3,6,4};

        System.out.println(maxProfit(prices));
    }
}
