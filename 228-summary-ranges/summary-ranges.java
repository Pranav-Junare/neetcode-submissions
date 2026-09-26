class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res= new ArrayList<>();
        
        int start=0;
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1 || nums[i+1]!=nums[i]+1){
                if(start==i)res.add(String.valueOf(nums[i]));
                else res.add(nums[start]+"->"+nums[i]);
                start=i+1;
            }
        }
        return res;
    }
}