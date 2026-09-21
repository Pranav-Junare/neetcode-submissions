class Solution {
    int res=0,tempRes=0;
    int[][] directions={{0,1},{0,-1},{1,0},{-1,0}};
    public int maxAreaOfIsland(int[][] grid) {
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]==1){
                    tempRes=0;
                    dfs(r,c,grid);
                    res=Math.max(res,tempRes);
                }
            }
        }
        return res;
    }

    void dfs(int r, int c, int[][] grid){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]==0) return;

        grid[r][c]=0;
        tempRes++;
        for(int[] dir:directions){
            dfs(r+dir[0],c+dir[1], grid);
        }
    }
}
