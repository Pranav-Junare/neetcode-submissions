class Solution {
    int memo[];
    public int coinChange(int[] coins, int amount) {
        memo=new int[amount+1];
        Arrays.fill(memo, -1);

        int res=dfs(amount, coins);
        return res==Integer.MAX_VALUE?-1:res;
    }
    int dfs(int remaining, int[]coins){

        if(remaining==0)return 0;
        if(remaining<0)return Integer.MAX_VALUE;

        if(memo[remaining]!=-1)return memo[remaining];
        
        int minimum=Integer.MAX_VALUE;

        for(int i=0;i<coins.length;i++){
            int res=dfs(remaining-coins[i], coins);

            if(res!=Integer.MAX_VALUE) minimum=Math.min(minimum,res+1);

        }
        memo[remaining]=minimum;
        return memo[remaining];
    }
}