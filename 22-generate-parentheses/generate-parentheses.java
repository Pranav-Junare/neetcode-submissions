class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res=new ArrayList<>();
        dfs(n,0,0,"");
        return res;
    }
    void dfs(int n,int open,int close,String curr){
        if(curr.length()==2*n){res.add(curr);return;}
        
        if(open<n) dfs(n,open+1,close,curr+"(");
        if(close<open)dfs(n,open,close+1,curr+")");
    }
}