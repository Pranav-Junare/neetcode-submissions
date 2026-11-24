class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[]state=new int[numCourses+1];
        Arrays.fill(state, 0);

        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++) graph.add(new ArrayList<>());

        for(int[] pre : prerequisites){
            int course=pre[0];
            int preq=pre[1];
            graph.get(preq).add(course);
        }

        for(int i=0;i<numCourses;i++){
            if(state[i]==0) if(!dfs(i, graph, state)) return false;
        }
        return true;
    }

    boolean dfs(int node,List<List<Integer>> graph, int[]state){
        if(state[node]==1)return false;
        if(state[node]==2)return true;

        state[node]=1;

        for(int nei:graph.get(node)){
            if(!dfs(nei, graph, state))return false;
        }
        state[node]=2;
        return true;
    }
}