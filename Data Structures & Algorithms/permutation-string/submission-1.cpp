class Solution {
public:
    bool checkInclusion(string s1, string s2) {
       if(s1.length()>s2.length())return false;

       vector<int>c1(26,0); 
       vector<int>c2(26,0);

        // Lets start by creating our initial window
        for(int i=0;i<s1.length();i++){
            c1[s1[i]-'a']++;
            c2[s2[i]-'a']++;
        }

        int match=0;

        for(int i=0;i<26;i++) if(c1[i]==c2[i]) match++;

        int l=0;
        for(int r=s1.length();r<s2.length();r++) {
            if(match==26) return true;

            int ind=s2[r]-'a';
            c2[ind]++;

            if(c1[ind]==c2[ind]) match++;
            else if(c1[ind]+1==c2[ind]) match--;
            
            ind=s2[l]-'a';
            c2[ind]--;

            if(c1[ind]==c2[ind]) match++;
            else if(c1[ind]-1==c2[ind]) match--;
            
            l++;
        }
        return match==26;
    }
};
