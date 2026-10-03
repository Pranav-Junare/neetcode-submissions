class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0,r=nums.length-1;
        int[] res=new int [2];
        while(l<r){
            if(nums[l]+nums[r]<target)l++;
            else if(nums[l]+nums[r]>target) r--;
            else{
                res[0]=l+1;
                res[1]=r+1;
                break;
            }
        }
        return res;
    }
}