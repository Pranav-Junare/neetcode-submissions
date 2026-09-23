class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        
        String[] res=new String[heights.length];
        Map<Integer,String> m=new HashMap<>();

        for(int i=0;i<heights.length;i++){
            m.put(heights[i],names[i]);
        }

        Integer[] sh=m.keySet().toArray(new Integer[0]);
        Arrays.sort(sh, Collections.reverseOrder());

        for(int i=0;i<heights.length;i++){
            res[i]=m.get(sh[i]);
        }
        return res;
    }
}