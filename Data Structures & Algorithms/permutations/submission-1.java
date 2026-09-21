class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res=new ArrayList<>();
        
        dfs(nums, new ArrayList<Integer>(), new boolean[nums.length]);
        return res;
    }

    void dfs(int[] nums, List<Integer> perm, boolean[] ba){

        if(perm.size()==nums.length){
            res.add(new ArrayList<>(perm));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!ba[i]){
                ba[i]=true;
                perm.add(nums[i]);
                dfs(nums, perm, ba);
                perm.remove(perm.size()-1);
                ba[i]=false;
            }
        }

    }
}
