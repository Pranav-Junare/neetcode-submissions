class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int currMin=prices[0];

        for(int i=1;i<prices.length;i++){
            // System.out.println("Current min: "+currMin);
            // System.out.println("Current profit: "+profit);
            currMin=Math.min(currMin, prices[i]);
            // System.out.println("Updated min: "+currMin);
            profit=Math.max(profit, prices[i]-currMin);
            // System.out.println("Updated profit: "+profit);


        }
        return profit;
    }
}