class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        res=new ArrayList<>();
        Arrays.sort(nums);
        dfs(0, nums,new ArrayList<Integer>());
        return res;
    }

    void dfs(int i, int[] nums,List<Integer> s){

        if(i>=nums.length){
            res.add(new ArrayList<Integer>(s));
            return;
        }

        s.add(nums[i]);
        dfs(i+1, nums, s);
        s.remove(s.size()-1);

        while(i+1<nums.length && nums[i]==nums[i+1] )i++;

        dfs(i+1, nums, s);

    }
}
