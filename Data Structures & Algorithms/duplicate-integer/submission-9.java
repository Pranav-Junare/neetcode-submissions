class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> h=new HashSet<>();
        for(int num:nums){
            if(h.contains(num))return true;
            h.add(num);
        }
        return false;
    }
}