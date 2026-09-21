class Solution {

    Set<Pair<Integer,Integer>> s=new HashSet<>();
    int ROWS, COLS;

    public boolean exist(char[][] board, String word) {
        ROWS=board.length;
        COLS=board[0].length;

        for(int i=0;i<ROWS;i++)
            for(int j=0;j<COLS;j++)
                if(dfs(0,i,j,word,board))return true;

        return false;        
    }

    boolean dfs(int i, int r, int c, String w, char[][] b){

        if(i==w.length())return true;

        if(r<0||c<0||r>=ROWS||c>=COLS||b[r][c]!=w.charAt(i)||s.contains(new Pair<>(r,c))) return false;

        s.add(new Pair<>(r,c));
        boolean res=dfs(i+1, r+1, c, w, b) ||
                    dfs(i+1, r, c+1, w, b) ||
                    dfs(i+1, r-1, c, w, b) ||
                    dfs(i+1, r, c-1, w, b);
        s.remove(new Pair<>(r,c));
                    return res;
    }
}
