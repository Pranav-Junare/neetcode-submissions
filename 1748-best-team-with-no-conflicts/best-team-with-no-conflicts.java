class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int [][] player=new int[ages.length][2];

        for(int i=0;i<ages.length;i++){
            player[i][0]=ages[i];
            player[i][1]=scores[i];
        }

        int dp[]=new int [ages.length];
        int res=0;

        Arrays.sort(player, (a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        for(int i=0;i<ages.length;i++){
            dp[i]=player[i][1];

            for(int j=0;j<i;j++) if(player[j][1]<=player[i][1])dp[i]=Math.max(dp[i], dp[j]+player[i][1]);

            res=Math.max(res,dp[i]);
        }
        return res;
    }
}