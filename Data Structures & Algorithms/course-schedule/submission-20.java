class Solution {
    Map<Integer, List<Integer>> m=new HashMap<>();
    Set<Integer> vis=new HashSet<>();
    
    public boolean canFinish(int nC, int[][] pre) {

        for(int i=0;i<nC;i++) m.put(i, new ArrayList<>());
        for(int p[]:pre) m.get(p[0]).add(p[1]);

        for(int i=0;i<nC;i++) if(!dfs(i)) return false;
        return true;
    }

    boolean dfs(int c){
        if(vis.contains(c))return false;
        if(m.get(c).isEmpty()) return true;

        vis.add(c);

        for(int pre:m.get(c)) if(!dfs(pre)) return false;

        vis.remove(c);
        m.put(c, new ArrayList<>());
        return true;
    }
}
