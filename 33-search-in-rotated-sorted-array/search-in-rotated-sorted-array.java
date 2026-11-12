class Solution {
    public int search(int[] nums, int target) {

        Map<Integer, Integer> m=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            m.put(nums[i], i);
        }

        if(m.containsKey(target))return m.get(target);
        else return -1;
    }
}