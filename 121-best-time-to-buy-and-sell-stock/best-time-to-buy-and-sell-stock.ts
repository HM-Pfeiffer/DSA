function maxProfit(prices: number[]): number {
    // declare 1st el of input array as min buy price, declare a maxProfit and currProfit
    let minPrice: number = prices[0];
    let maxProfit = 0;
    let currProfit;

    for(let i: number = 0; i < prices.length; i++){
        if (prices[i] < minPrice){
            minPrice = prices[i];
            continue;
        }
        currProfit = prices[i] - minPrice;
        maxProfit = currProfit > maxProfit ? currProfit : maxProfit; 
    }
    return maxProfit;
};