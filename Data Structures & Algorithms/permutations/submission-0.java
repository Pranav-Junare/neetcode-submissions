class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        List<Integer> p=new ArrayList<>();
        dfs(nums, p, new boolean[nums.length]);
        return res;
    }

    void dfs( int[] nums, List<Integer> p, boolean[] a){
        if(p.size()==nums.length){
            res.add(new ArrayList<>(p));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!a[i]){
                p.add(nums[i]);
                a[i]=true;
                dfs(nums, p, a);
                p.remove(p.size()-1);
                a[i]=false;
            }
        }

    }
}
