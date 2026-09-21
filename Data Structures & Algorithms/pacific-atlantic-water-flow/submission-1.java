class Solution {
    int [][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    int ROW,COL;
    public List<List<Integer>> pacificAtlantic(int[][] h) {
        ROW=h.length;COL=h[0].length;
        boolean[][]p=new boolean[ROW][COL];
        boolean[][]a=new boolean[ROW][COL];
        for(int r=0;r<ROW;r++){
            dfs(r,0,p,h);
            dfs(r,COL-1,a,h);
        }
        for(int c=0;c<COL;c++){
            dfs(0,c,p,h);
            dfs(ROW-1,c,a,h);
        }

        List<List<Integer>>res=new ArrayList<>();
        for(int i=0;i<ROW;i++) 
            for(int j=0;j<COL;j++)
                if(p[i][j] && a[i][j])
                    res.add(Arrays.asList(i,j));
        return res;
    }
    void dfs(int r, int c, boolean[][] ocean, int[][]h){
        ocean[r][c]=true;
        for(int[] d: dir){
            int nr=r+d[0], nc=c+d[1];
            if(nr>=0 && nr<h.length && nc>=0 && nc<h[0].length && !ocean[nr][nc] && h[nr][nc]>=h[r][c]) dfs(nr,nc,ocean,h);
        }
    }
}
