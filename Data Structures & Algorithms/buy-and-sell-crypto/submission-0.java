class Solution {
    public int maxProfit(int[] prices) {
        int l = 0; int r = 1; int maxR = 0;
        while (r < prices.length) {
            if (prices[r] < prices[l]) {
                l = r;
                r++;
            }
            else {
                int profit = prices[r] - prices[l];
                maxR = Math.max(profit, maxR);
                r++;
            }
        }
        return maxR;
    }
}
