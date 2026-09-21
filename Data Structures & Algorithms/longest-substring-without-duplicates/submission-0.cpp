class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<int, char>mp; int l=0,res=0,r=0;
        for(r;r<s.size();r++){
            if(mp.find(s[r]) != mp.end()) l=max(mp[s[r]]+1,l);
            mp[s[r]]=r;
            res=max(res,r-l+1);
        }
        return res;
    }
};
