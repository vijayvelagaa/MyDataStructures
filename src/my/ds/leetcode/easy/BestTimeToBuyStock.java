package my.ds.leetcode.easy;

public class BestTimeToBuyStock {

    public static int buyStock (int[] prices) {
        int profit = 0;

        if(prices.length == 0) {
            return profit;
        }

        int minPrice = 0;
        int minPriceIndex = 0;
        //Buy Stock
        for(int i = 0; i < prices.length; i++) {
                if(minPrice ==0 & i == prices.length-1){
                    return profit;
                }
                if(minPrice ==0 && prices[i] < prices[i +1]) {
                    minPrice = prices[i];
                    minPriceIndex = i;
                } else if (minPrice > prices[i]) {
                    minPrice = prices[i];
                    minPriceIndex = i;
            }
        }

        //sell stock
        int maxPrice = 0;

        if(minPriceIndex >= prices.length-1) {
            return profit;
        }

        for(int i = minPriceIndex; i< prices.length; i++) {
            if(maxPrice ==0  && prices[i] < prices[i+1]) {
                maxPrice = prices[i+1];
            }else if(maxPrice < prices[i]) {
                maxPrice = prices[i];
            }


        }

    return maxPrice - minPrice;
    }


    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int currentPrice : prices) {
            minPrice = Math.min(currentPrice, minPrice);
            maxProfit = Math.max(maxProfit, currentPrice - minPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrice = {7,1,5,3,4,6};
        int[] stockPrice1 = {7,6,4,3,1};
        int[] stockPrice2 = {2,4,1};
        System.out.println(buyStock(stockPrice2));
        //System.out.println(maxProfit(stockPrice2));
    }
}
