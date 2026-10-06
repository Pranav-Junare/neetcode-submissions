class Solution {
    int [][] dp;
    public int maxProfit(int[] prices) { 
        dp=new int[prices.length][2];
        for(int i=0;i<prices.length;i++){
            dp[i][0]=-1;
            dp[i][1]=-1;
        }
        return dfs(prices, 0, false);
    }
    int dfs(int[]p, int day, boolean holding){
        if(day>=p.length)return 0;

        int state=holding?1:0;
        if(dp[day][state]!=-1)return dp[day][state];

        int res;
        if(holding){
            int wait=dfs(p, day+1, true);
            int sell=p[day]+dfs(p,day+2,false);
            res=Math.max(sell,wait);
        }
        else{
            int skip=dfs(p, day+1, false);
            int buy=-p[day]+dfs(p,day+1,true);
            res=Math.max(skip,buy);
        }
        dp[day][state]=res;
        return res;
    }
}