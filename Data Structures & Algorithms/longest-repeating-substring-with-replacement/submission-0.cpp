class Solution {
public:
    int characterReplacement(string s, int k) {
        int l=0,maxf=0,maxL=0;
        unordered_map<char,int> count;
        for(int r=0;r<s.size();r++){
            count[s[r]]++;
            maxf=max(maxf,count[s[r]]);
            while((r-l+1) - maxf > k){
                count[s[l]]--;
                l++;
            }
            maxL=max(r-l+1, maxL );
        }
        return maxL;
    }
};
