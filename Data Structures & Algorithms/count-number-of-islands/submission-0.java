class Solution {

    int res=0;
    int[][] direction = {{0,1},{0,-1},{1,0},{-1,0}};

    public int numIslands(char[][] grid) {
        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]=='1'){
                    dfs(r,c,grid);
                    res++;
                }
            }
        }
        return res;
    }

    void dfs(int r, int c, char[][]g){
        if(r>=g.length || c>=g[0].length || r<0||c<0||g[r][c]=='0') return;

        g[r][c]='0';

        for(int[] dir:direction){
            dfs(r+dir[0],c+dir[1],g);
        }
    }
}
