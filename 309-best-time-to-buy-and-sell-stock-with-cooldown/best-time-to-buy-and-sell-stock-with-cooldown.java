class Solution {
    int [][] dp;
    public int maxProfit(int[] prices) {
        dp=new int[prices.length][2];

        for(int i=0;i<prices.length;i++){
            dp[i][0]=-1;
            dp[i][1]=-1;
        }

        return dfs(prices,0,false);
    }

    int dfs(int[]prices, int day, boolean holding){
        if(day>=prices.length)return 0;

        int state=holding?1:0;
        if(dp[day][state]!=-1)return dp[day][state];

        int res;
        if(holding){
            // Option 1, do nothing
            int hold=dfs(prices, day+1,true);

            // Option 2, sell
            int sell=prices[day]+dfs(prices,day+2,false);
            res= Math.max(sell,hold);
        }
        else{
            int buy=-prices[day]+dfs(prices, day+1, true);
            int wait=dfs(prices, day+1,false);

            res= Math.max(buy, wait);
        }
        dp[day][state]=res;
        return res;
    }
}