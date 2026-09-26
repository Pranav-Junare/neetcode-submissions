class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int currMin=prices[0];

        for(int i=1;i<prices.length;i++){
            int tempMin=Math.min(currMin, prices[i]);

            currMin=tempMin;

            profit=Math.max(profit, prices[i]-currMin);

        }
        return profit;
    }
}