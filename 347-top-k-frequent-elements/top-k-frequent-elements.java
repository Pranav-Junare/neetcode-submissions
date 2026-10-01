class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++) freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);

        List<Integer> n=new ArrayList<>(freq.keySet());

        Collections.sort(n,(a,b)->freq.get(b)-freq.get(a));
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=n.get(i);
        }
        return res;
    }
}