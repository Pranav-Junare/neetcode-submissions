class Solution {

    List<List<Integer>> res;

    public List<List<Integer>> combinationSum2(int[] c, int target) {
        res=new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        Arrays.sort(c);
        dfs(0, c, target, s, 0);

        return res;
    }

    void dfs(int i, int[] c, int t, List<Integer> s, int total){

        if(total == t){
            res.add(new ArrayList<>(s));
            return;
        }
        if(i==c.length || total>t) return;

        s.add(c[i]);
        dfs(i+1,c,t,s,total+c[i]);
        s.remove(s.size()-1);
        
        while(i+1<c.length && c[i]==c[i+1]) i++;

        dfs(i+1,c,t,s,total);
        
    }
}
