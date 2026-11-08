class Solution {
    int [] memo;
    public int numSquares(int n) {
        memo=new int[n+1];
        Arrays.fill(memo, -1);
        int res=dfs(n);
        return res;
    }
    int dfs(int remaining){
        if(remaining==0)return 0;
        if(remaining<0)return Integer.MAX_VALUE;

        if(memo[remaining]!=-1)return memo[remaining];

        int min=Integer.MAX_VALUE;

        for(int i=1;i*i<=remaining;i++){
            int res=dfs(remaining-(i*i));
            if(res!=Integer.MAX_VALUE) min=Math.min(res+1,min);
        }
        memo[remaining]=min;
        return memo[remaining];
    }
}