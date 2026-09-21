class Solution {
    List<List<String>> res;
    public List<List<String>> partition(String s) {
        res=new ArrayList<>();
        List<String> sub = new ArrayList<>();

        dfs(0,0,s,sub);

        return res;
    }

    void dfs(int l, int r, String s, List<String> sub){
        if(r>=s.length()) { 
            if(r==l){
                res.add(new ArrayList<>(sub));
            }
                return;
        }

        if(isPali(l,r,s)){
            sub.add(s.substring(l,r+1));
            dfs(r+1,r+1,s, sub);
            sub.remove(sub.size()-1);
        }
        dfs(l,r+1,s,sub);
    }

    boolean isPali(int l, int r, String s){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;r--;
            
        }
        return true;
    }
}
