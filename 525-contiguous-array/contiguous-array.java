class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        // Make a array to hold the prefix values
        int prefix[] = new int[n+1];
        for(int i=0;i<n;i++)
            prefix[i+1]+=prefix[i]+(nums[i]==1 ? 1:-1);
        

        int maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<=n;i++){
            if(map.containsKey(prefix[i])) maxLen = Math.max(maxLen, i-map.get(prefix[i]));
            else map.put(prefix[i], i);
        }
        return maxLen;
    }
}