class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int res=0;

        for(int num:nums) s.add(num);

        for(int num:s){
            int tempMax;
            if(!s.contains(num-1)){
                tempMax=0;
                int a=num;
                while(s.contains(a)){
                    tempMax++;
                    a++;
                }
                res=Math.max(res,tempMax);
            }
        }
        return res;
    }
}