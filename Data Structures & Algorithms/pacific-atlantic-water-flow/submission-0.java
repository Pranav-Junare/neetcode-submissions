class Solution {
    int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
    int ROW, COL;

    public List<List<Integer>> pacificAtlantic(int[][] h) {
        
        ROW=h.length;
        COL=h[0].length;
        List<List<Integer>>res=new ArrayList<>();

        boolean [][] p=new boolean[ROW][COL];
        boolean [][] a=new boolean[ROW][COL];

        for(int r=0;r<ROW;r++){
            dfs(r,0,p,h);
            dfs(r,COL-1,a,h);
        }
        for(int c=0;c<COL;c++){
            dfs(0,c,p,h);
            dfs(ROW-1,c,a,h);
        }

        for(int r=0;r<ROW;r++) for(int c=0;c<COL;c++) if(p[r][c] && a[r][c]) res.add(Arrays.asList(r,c));
        return res;
    }
    
    void dfs(int r, int c, boolean[][] o, int[][] h){
        o[r][c]=true;
        for(int[] d:dir){
            int nr=r+d[0];
            int nc=c+d[1];
            if(nr>=0 && nc>=0 && nr<h.length && nc<h[0].length && !o[nr][nc] && h[nr][nc]>=h[r][c]) dfs(nr, nc, o, h);
        }
    }
}
