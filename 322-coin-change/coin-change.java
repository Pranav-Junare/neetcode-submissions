class Solution {
    int memo[];
    public int coinChange(int[] coins, int amount) {
        memo=new int[amount+1];
        Arrays.fill(memo, -1);

        int res=dfs(amount, coins);
        return res==Integer.MAX_VALUE?-1:res;
    }
    int dfs(int remain, int[]coins){
        if(remain<0)return Integer.MAX_VALUE;
        if(remain==0)return 0;

        if(memo[remain]!=-1)return memo[remain];

        int min=Integer.MAX_VALUE;

        for(int i=0;i<coins.length;i++){
            int res=dfs(remain-coins[i], coins);

            if(res!=Integer.MAX_VALUE){
                min=Math.min(res+1,min);
            }
        }
        memo[remain]=min;
        return memo[remain];
    }
}