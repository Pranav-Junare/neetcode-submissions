class Solution {
    List<List<String>> res;
        List<String> sub=new ArrayList<>();
    public List<List<String>> partition(String s) {
        res=new ArrayList<>();
        dfs(0,0,s);
        return res;
    }

    void dfs(int l, int r, String s){
        if(r>=s.length()){
            if(r==l) res.add(new ArrayList<>(sub));
            return; 
        }

        if(isPali(s, l, r)){
            sub.add(s.substring(l,r+1));
            dfs(r+1, r+1, s);
            sub.remove(sub.size()-1);
        }
        dfs(l,r+1, s);
    }

    boolean isPali(String s,int l, int r){
        
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;r--;
        }
        return true;
    }
}
