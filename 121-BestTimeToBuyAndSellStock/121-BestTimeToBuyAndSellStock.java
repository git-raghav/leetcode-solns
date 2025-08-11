// Last updated: 8/12/2025, 12:41:50 AM
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buyPrice) {
                int profit = prices[i] - buyPrice;
                max = Math.max(profit, max);
            } else
                buyPrice = prices[i];
        }
        return max;
    }
}