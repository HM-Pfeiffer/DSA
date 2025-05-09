class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # declare two variables to hold min buy price and max profil 
        min_buy, max_profit = float(inf), 0

        # iterate through prices list
        for price in prices:
            # if the current price is lower than the min_buy 
            if price < min_buy:
                # buy becomes the min_buy price, then continue
                min_buy = price
                continue
            # if the current price minus the min_buy price is greater than the current max_profit
            if price - min_buy > max_profit:
                # reassign max profit to be the val of current price minus min_buy price
                max_profit = price - min_buy
            # alternative way one-liner: max_profit = max_profit if (price - min_buy) < max_profit else price - min_buy 
        
        # return the max_profit 
        return max_profit
