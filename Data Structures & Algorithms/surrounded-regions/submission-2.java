class Solution {

    int ROW, COL;
    int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};

    public void solve(char[][] board) {
        ROW=board.length;
        COL=board[0].length;
        boolean[][] visited=new boolean[ROW][COL];

        for(int r=0;r<ROW;r++){
            if(board[r][0]=='O')
                dfs(r,0,visited,board);
            if(board[r][COL-1]=='O')
                dfs(r,COL-1,visited,board);
        }
        for(int c=0;c<COL;c++){
             if(board[0][c]=='O')
                dfs(0,c,visited,board);
            if(board[ROW-1][c]=='O')
                dfs(ROW-1,c,visited,board);
        }

        for(int i=1;i<ROW-1;i++){
            for(int j=1;j<COL-1;j++){
                if(board[i][j]=='O' && !visited[i][j]){
                    board[i][j]='X';
                }
            }
        }
    }

    void dfs(int r, int c, boolean[][] v, char[][] b){
        if(r<0 || r>=ROW || c<0 || c>=COL || v[r][c] || b[r][c]=='X') 
            return;
        
        v[r][c]=true;

        for(int[] d:dir){
            dfs(r+d[0],c+d[1],v,b);
        }
    }
}
