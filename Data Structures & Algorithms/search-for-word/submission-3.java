class Solution {

    Set<Pair<Integer,Integer>> s=new HashSet<>();
    int ROWS;
    int COLS;

    public boolean exist(char[][] board, String word) {

        ROWS=board.length;
        COLS=board[0].length;
        for(int i=0;i<ROWS;i++) 
            for(int j=0;j<COLS;j++) 
                if(dfs(0,i,j,word,board)) return true;
        
        return false;
    }

    boolean dfs(int i, int r, int c, String word, char[][] b){
        if(i==word.length()) return true;

        if(r<0 || c<0 || r>=ROWS || c>=COLS || b[r][c]!=word.charAt(i) || s.contains(new Pair<>(r,c))) return false;

        s.add(new Pair<>(r,c));
        boolean res=dfs(i+1, r+1, c, word, b) ||
                    dfs(i+1, r-1, c, word, b) ||
                    dfs(i+1, r, c+1, word, b) ||
                    dfs(i+1, r, c-1, word, b);
        s.remove(new Pair<>(r,c));
        return res;
    }
}
