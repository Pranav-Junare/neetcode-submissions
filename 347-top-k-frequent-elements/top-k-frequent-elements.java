class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Count and Number
        Map<Integer, Integer> m=new HashMap<>();

        for(int num:nums) m.put(num, m.getOrDefault(num,0)+1);
        List<Integer> uNum=new ArrayList<>(m.keySet());
        
        Collections.sort(uNum, (a,b)->m.get(b)-m.get(a));

        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=uNum.get(i);
        }
        return res;
    }
}