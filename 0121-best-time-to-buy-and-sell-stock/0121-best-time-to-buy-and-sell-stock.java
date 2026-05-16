class Solution {

    public int maxProfit(int[] prices) {

    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int i = 0; i < prices.length; i++) {

        if(buyPrice < prices[i]) {

            int currProfit = prices[i] - buyPrice; // today's profit
            maxProfit = Math.max(maxProfit, currProfit);

        } else {

            buyPrice = prices[i];
        }
    }

    return maxProfit;
}
}


   
