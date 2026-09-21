class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
      List<List<Integer>> res = new ArrayList<>();
      List<Integer> s = new ArrayList<>();

      dfs(0, target, nums, s, res);

      return res;  
    }

    void dfs(int i, int target,int[] nums, List<Integer> s, List<List<Integer>> res){
        if(target<0 || i>=nums.length)return;

        if(target==0){
            res.add(new ArrayList<>(s));
            return;
        }

        s.add(nums[i]);
        dfs(i, target-nums[i], nums, s, res);
        s.remove(s.size()-1);
        dfs(i+1, target, nums, s, res);
    }
}
