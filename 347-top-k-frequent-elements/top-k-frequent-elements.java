class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++) freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);

// Add in the buckets of frequencies
        List<Integer>[] buckets=new List[nums.length+1];
        for(Map.Entry<Integer,Integer> entry:freq.entrySet()){
            int count=entry.getValue();
            int number=entry.getKey();

            if(buckets[count]==null) buckets[count]=new ArrayList<>();
            buckets[count].add(number);
        }

        int[] res=new int[k];
        int ind=0;

        for(int i=buckets.length-1;i>=0 && ind<k;i--){
            if(buckets[i]!=null){
                for(int n:buckets[i]){
                    res[ind++]=n;
                    if(ind==k)return res;
                }
            }
        }
        return res;
    }
}