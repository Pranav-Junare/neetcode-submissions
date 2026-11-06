class Solution {
    int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    public int numIslands(char[][] grid) {

        int res=0;

        for(int r=0;r<grid.length;r++){
            for(int c=0;c<grid[0].length;c++){
                if(grid[r][c]=='1') {dfs(r,c,grid); res++;}
            }
        }
        return res;
    }

    void dfs(int r, int c, char[][] grid){

        if(r<0 || r>=grid.length || c<0 || c>=grid[0].length)return;

        if(grid[r][c]=='0')return;

        grid[r][c]='0';

        for(int[] d:dir){
            dfs(r+d[0], c+d[1], grid);
        }
    }

}