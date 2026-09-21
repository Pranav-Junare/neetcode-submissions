class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> subsets(int[] nums) {
        res=new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        dfs(0,nums, s);
        return res;
    }

    void dfs(int i, int[] nums, List<Integer> s){
        if(i>=nums.length) {
            res.add(new ArrayList<>(s));
            return;
        }

        s.add(nums[i]);
        dfs(i+1, nums, s);
        s.remove(s.size()-1);
        dfs(i+1, nums,s);
    }
}
