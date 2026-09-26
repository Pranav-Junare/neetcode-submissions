class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res= new ArrayList<>();
        
        int l=0, r=0;
        while(r<nums.length){

            if(r==nums.length-1){
                if(nums[l]==nums[r]) res.add(Integer.toString(nums[r]));
                else{
                    res.add(nums[l]+"->"+nums[r]);
                }
                break;
            }

            // Checks to move pointer 'r', the check may cuz an out of bound error but lets see
            if(nums[r]==nums[r+1]-1){
                r++;
            }

            // If not same how to add
            else{
                if(nums[l]==nums[r]) res.add(Integer.toString(nums[r]));
                
                else{
                    res.add(nums[l]+"->"+nums[r]);
                }
                r++;
                l=r;
            }
        }
        return res;
    }
}