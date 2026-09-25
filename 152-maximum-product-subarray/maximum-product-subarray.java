class Solution {
    public int maxProduct(int[] nums) {

        int res=nums[0];
        int currMax=nums[0];
        int currMin=nums[0];
        
        for(int i=1;i<nums.length;i++){
            int tempMax=Math.max(nums[i], Math.max(currMax*nums[i],currMin*nums[i]));
            int tempMin=Math.min(nums[i], Math.min(currMax*nums[i],currMin*nums[i]));

            currMax=tempMax;
            currMin=tempMin;

            res=Math.max(res,currMax);
        }
        return res;
    }
}