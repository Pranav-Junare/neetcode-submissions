class Solution {
public:
    bool isAnagram(string s, string t) {
        
        vector<int> vec(26,0);
        if(s.size()!= t.size()) return false;

        for(int i=0;i<s.size();i++){
            vec[static_cast<int>(s[i])-static_cast<int>('a')]+=1;
            vec[static_cast<int>(t[i])-static_cast<int>('a')]-=1;
        }
        for(auto val: vec){
            if(val!=0){return false;}
        }
        return true;
    }
};
