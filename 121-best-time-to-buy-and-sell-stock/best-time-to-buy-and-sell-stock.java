class Solution {
    public int maxProfit(int[] prices) {
        int buyP = prices[0];
        int profit = 0;
        int maxP = 0;
        for(int p:prices){
            buyP = Math.min(buyP, p);
            profit = p-buyP;
            maxP = Math.max(maxP, profit);
        }

        return maxP;
    }
}