class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> set=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(set.containsKey(diff))return new int[]{i, set.get(diff)};
            set.put(nums[i],i);
        }
        return new int[]{0};
    }
}