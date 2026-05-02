class Solution {
    public int maxProfit(int[] prices) {
        int l = 0; int r = 1; int maxR = 0;
        while (r < prices.length) {
            if (prices[r] < prices[l]) {
                l = r;
                
            }
            else {
                maxR = Math.max(prices[r] - prices[l], maxR);
            }
            r++;
        }
        return maxR;
    }
}
