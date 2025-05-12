// 121. Best Time to Buy and Sell Stock
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] maxValue = new int[n];
        maxValue[n-1] = prices[n-1];

        for(int i = n-2 ; i>=0;i--){
            maxValue[i] = Math.max(maxValue[i+1],prices[i]);
        }

        int ans = 0 ;
        for(int i=0;i<prices.length ;i++){
            int currPro = maxValue[i] - prices[i];
            ans = Math.max(ans , currPro);
        }
        return ans ;
    }
}
    }
}
