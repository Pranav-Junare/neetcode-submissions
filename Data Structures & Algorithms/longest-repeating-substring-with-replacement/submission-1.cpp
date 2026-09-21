class Solution {
public:
    int characterReplacement(string s, int k) {
        unordered_map<char,int>c;
        int l=0,maxf=0,maxl=0;
        for(int r=0;r<s.size();r++){
            c[s[r]]++;
            maxf=max(maxf,c[s[r]]);

            while((r-l+1)-maxf > k){c[s[l]]--;l++;}
            maxl=max(maxl,r-l+1);
        }
        return maxl;
    }
};
