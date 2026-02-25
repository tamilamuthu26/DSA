package org.example.DAY2;

//Best Time to Buy and Sell Stock
public class P3 {
        public static int maxProfit(int[] prices) {
            int min = prices[0];
            int profit = 0;

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < min) {
                    min = prices[i];
                } else {
                    profit = Math.max(profit, prices[i] - min);
                }
            }

            return profit;
        }

        public static void main(String[] args) {
            int[] a = {10, 1, 5, 6, 7, 1};
            int[] b = {10, 8, 7, 5, 2};

            System.out.println(maxProfit(a));
            System.out.println(maxProfit(b));
        }
}
