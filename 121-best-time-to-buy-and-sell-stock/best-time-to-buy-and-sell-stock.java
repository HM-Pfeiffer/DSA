class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min_buy_index = prices[0];
        int  current_profit;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < min_buy_index){
                min_buy_index = prices[i];
                continue;
            }
            current_profit = prices[i] - min_buy_index;
            max_profit = current_profit > max_profit ? current_profit : max_profit;
        }
        return max_profit;
    }
}