class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> s = new ArrayList<>();

        dfs(0, nums, s, res);

        return res;
    }

    private void dfs(int i, int[] nums, List<Integer> s, List<List<Integer>> res){
        if(i>=nums.length) {res.add(new ArrayList<>(s)); return;}

        s.add(nums[i]);
        dfs(i+1, nums, s, res);
        s.remove(s.size()-1);
        dfs(i+1, nums, s, res);
    }
}
