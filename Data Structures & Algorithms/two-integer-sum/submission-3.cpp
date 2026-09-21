class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> m;
        for(int i; i<nums.size();i++){
            int diff=target-nums[i];
            if (m.find(diff)!=m.end()){
                return{m[diff], i};
            }
            m.emplace(nums[i],i);
        }
        return {};
    }
};