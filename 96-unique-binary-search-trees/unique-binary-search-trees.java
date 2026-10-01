class Solution {
    public int numTrees(int n) {
        int []memo=new int[n+1];

        memo[0]=1;
        memo[1]=1;

        for(int nodes=2;nodes<=n;nodes++){
            int total=0;
            for(int root=1;root<=nodes;root++){
                int left=root-1;
                int right=nodes-root;
                total+=memo[left]*memo[right];
            }
            memo[nodes]=total;
        }
        return memo[n];
    }
}