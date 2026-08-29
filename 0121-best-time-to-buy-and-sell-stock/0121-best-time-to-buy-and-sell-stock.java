class Solution {
    public int maxProfit(int[] prices) {

    int maxCurrentProfit = 0;
    int maxProfitSoFar = 0;

    for (int i = 1; i < prices.length; i++) {

  
        int dailyDifference = prices[i] - prices[i - 1];

       
        maxCurrentProfit = Math.max(
            0,
            maxCurrentProfit + dailyDifference
        );

     
        maxProfitSoFar = Math.max(
            maxProfitSoFar,
            maxCurrentProfit
        );
    }

    return maxProfitSoFar;
}
}