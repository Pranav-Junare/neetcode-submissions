class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        // Lets create our bucket
        vector<vector<int>>freq(nums.size()+1);
        // Create a map to map
        unordered_map<int,int>mp;

        // Mapping numbers in the map and get individual freqency
        for(auto i:nums){mp[i]=1+mp[i];}
        // Setting the freq in the bucket
        for(const auto& e:mp){freq[e.second].push_back(e.first);}
        // Freq are set for each number, now i just go and set res
        vector<int>res;
        for(int i=freq.size()-1;i>0;i--){
            for(auto n:freq[i]){
                res.push_back(n);
                if (res.size()==k){
                    return res;
                }
            }
        }
        return res;
    }
};
