class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
       unordered_map<string, vector<string>>r;
       for(const auto& s:strs){
        vector<int>cnt(26,0);
        for(char c:s){cnt[c-'a']++;}
        string key=to_string(cnt[0]);
        for(int i=0;i<cnt.size();i++){key+=','+to_string(cnt[i]);}
        r[key].push_back(s);
       }
       vector<vector<string>>res;
       for(const auto& pair:r){res.push_back(pair.second);}
       return res;
    }
};
