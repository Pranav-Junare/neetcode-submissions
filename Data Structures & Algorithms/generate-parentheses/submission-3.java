class Solution {
    List<String> res;
    public List<String> generateParenthesis(int n) {
        res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();

        dfs(0,0,n,sb);

        return res;
        
    }

    void dfs(int o, int c, int n, StringBuilder sb){
        if(o==c && o==n){
            res.add(sb.toString());
            return;
        }
        if(o<n){
            sb.append("(");
            dfs(o+1, c,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(c<o){
            sb.append(")");
            dfs(o, c+1,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
