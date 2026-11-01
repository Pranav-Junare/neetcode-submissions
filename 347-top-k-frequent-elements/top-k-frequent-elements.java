class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map=new HashMap<>();

        // Have the frequencies, now what?
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        // Create a bucket, i.e a arraylist of arraylist of integer and out the numbers in that
        List<Integer>[] buckets=new List[nums.length+1];
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int number=entry.getKey();
            int freq=entry.getValue();

            if(buckets[freq]==null)buckets[freq]=new ArrayList<Integer>();
            buckets[freq].add(number);
        }

        // Everything arranged in the buckets with their frequency and all
        // Now just need to add the max values in a new int[]res

        int[] res=new int[k];
        int ind=0;

        for(int i=buckets.length-1;i>=0;i--){
            if(buckets[i]!=null){
                for(int v:buckets[i]){
                    res[ind++]=v;
                    if(ind==k)return res;
                }
            }
        }
        return res;
    }
}