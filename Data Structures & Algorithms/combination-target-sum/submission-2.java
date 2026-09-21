class Solution {
        List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> cs = new ArrayList<>();

        dfs(0, target, nums, cs);
        return res;
    }

    void dfs(int i, int target, int[]nums, List<Integer> cs){
        if(target<0 || i>= nums.length) return ;
        if(target == 0){
            res.add(new ArrayList<>(cs));
            return;
        }

        cs.add(nums[i]);
        dfs(i, target-nums[i], nums, cs);
        cs.remove(cs.size()-1);
        dfs(i+1, target, nums, cs);

    }
}
