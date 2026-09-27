class Solution {
    public boolean findSubarrays(int[] nums) {

        Set<Integer>seen=new HashSet<>();
        int currNum=0;
        int l=0, r=1;

        while(r<nums.length){
            currNum=nums[l]+nums[r];
            if(seen.contains(currNum))return true;
            seen.add(currNum);l++;r++;
        }
        return false;
    }
}