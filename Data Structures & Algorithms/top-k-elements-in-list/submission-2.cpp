class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        // 1. Setup
        unordered_map<int,int>mp;
        vector<vector<int>>v(nums.size()+1);
        // 2. Main Logic
        for (auto i:nums){mp[i]=1+mp[i];}
        for(const auto& e:mp){v[e.second].push_back(e.first);}
        // 3. Ouput
        vector<int>res;
        for(int i=v.size()-1;i>0;i--){
            for(int n:v[i]){
            res.push_back(n);
            if(res.size()==k){return res;}
            }
        }
        return res;
    }
};
