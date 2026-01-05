//leetcode problem(121) best time to buy stock
class buysellstock {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int maxx_profit=0;
        int buy_prices=prices[0];
        for(int i=1;i<n;i++){
            int curr_profit=prices[i]-buy_prices;
            if(curr_profit>maxx_profit){
                maxx_profit=curr_profit;
            }
            if(prices[i]<buy_prices){
                buy_prices=prices[i];
            }
        }
        return maxx_profit;

            }
}