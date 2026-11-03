class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));

        List<int[]> res=new ArrayList<>();

        for(int[] interval:intervals){
            if(res.isEmpty() || interval[0]>res.get(res.size()-1)[1]) res.add(interval);
            else{
                int[] lastMerged=res.get(res.size()-1);
                lastMerged[1]=Math.max(interval[1],lastMerged[1]);
            }
            
        }
        return res.toArray(new int[res.size()][]);
    }
}