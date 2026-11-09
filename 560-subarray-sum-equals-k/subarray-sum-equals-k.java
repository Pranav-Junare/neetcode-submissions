class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> m=new HashMap<>();

        m.put(0, 1);

        int res=0;
        
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }

        for(int num:nums){
            int need=num-k;

            if(m.containsKey(need)) res+=m.get(need);   

            m.put(num, m.getOrDefault(num,0)+1);
        }    
        return res; 
    }
}