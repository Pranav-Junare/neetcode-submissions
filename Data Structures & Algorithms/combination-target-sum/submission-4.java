class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> s=new ArrayList<>();

        dfs(0, nums, target, s, res);
        return res;
    }

    void dfs(int i, int[] nums, int target, List<Integer> s, List<List<Integer>> res){
        if(target==0) {res.add(new ArrayList<>(s)); return;}

        if(i>=nums.length || target<0) return;

        s.add(nums[i]);        
        dfs(i, nums, target-nums[i], s, res);  
        s.remove(s.size()-1);
        dfs(i+1, nums, target, s, res);  
 
    }
}
