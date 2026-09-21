class Solution {
    private Map<Integer, List<Integer>> pm=new HashMap<>();
    private Set<Integer> vis=new HashSet<>();

    public boolean canFinish(int nC, int[][] pre) {

        for(int i=0;i<nC;i++) pm.put(i, new ArrayList<>());

        for(int[] p:pre) pm.get(p[0]).add(p[1]);

        for(int c=0;c<nC;c++) if(!dfs(c)) return false;
        return true;
    }

    boolean dfs(int c){
        if(vis.contains(c)) return false;

        if(pm.get(c).isEmpty()) return true;

        vis.add(c);

        for(int p:pm.get(c)) if(!dfs(p)) return false;

        vis.remove(c);
        pm.put(c, new ArrayList<>());
        return true;
    }
}
