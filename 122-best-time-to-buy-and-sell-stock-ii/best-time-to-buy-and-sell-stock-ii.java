class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxEarn = 0;
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            if(buyPrice<prices[i]){
                profit += prices[i]-buyPrice;
                maxEarn = Math.max(maxEarn, profit);
            }
            buyPrice = prices[i];
        }

        return maxEarn;
    }
}