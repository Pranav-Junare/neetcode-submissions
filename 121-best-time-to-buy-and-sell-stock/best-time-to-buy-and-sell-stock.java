class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int currMin=prices[0];

        for(int i=1;i<prices.length;i++){
            currMin=Math.min(currMin, prices[i]);
            profit=Math.max(profit, prices[i]-currMin);

        }
        return profit;
    }
}