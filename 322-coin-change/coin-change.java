class Solution {
    int[] memo;
    public int coinChange(int[] coins, int amount) {
        memo=new int[amount+1];
        Arrays.fill(memo, -1);

        int res=dfs(amount, coins);
        return res==Integer.MAX_VALUE?-1:res;
    }

    int dfs(int amount, int[]coins){
        if(amount<0)return Integer.MAX_VALUE;
        if(amount==0)return 0;

        if(memo[amount]!=-1)return memo[amount];

        int min=Integer.MAX_VALUE;

        for(int i=0;i<coins.length;i++){
            int res=dfs(amount-coins[i], coins);

            if(res!=Integer.MAX_VALUE) min=Math.min(res+1,min);
        }
        memo[amount]=min;
        return memo[amount];
    }
}