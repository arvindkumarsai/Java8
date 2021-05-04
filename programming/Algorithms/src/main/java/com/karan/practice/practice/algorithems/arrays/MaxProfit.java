package com.karan.practice.practice.algorithems.arrays;

public class MaxProfit {

    public static int max(int arrStockPrice[]) {

        if (arrStockPrice == null || arrStockPrice.length < 2) {
            return 0;
        }

        int lowestStockPriceTillNow = arrStockPrice[0];
        int maxProfitTillNow = 0;

        for (int i = 0; i < arrStockPrice.length; i++) {

            if (arrStockPrice[i] < lowestStockPriceTillNow) {
                lowestStockPriceTillNow = arrStockPrice[i];
            } else {
                if (arrStockPrice[i] - lowestStockPriceTillNow > maxProfitTillNow) {
                    maxProfitTillNow = arrStockPrice[i] - lowestStockPriceTillNow;
                }
            }
        }
        return maxProfitTillNow;

    }

    public static void main(String[] args) {
        int price[] = {100, 80, 120, 130, 70, 60, 100, 125};
        int price1[] = {100, 80, 120};
        //System.out.println(max(price));
        System.out.println(max(price1));
    }
}
