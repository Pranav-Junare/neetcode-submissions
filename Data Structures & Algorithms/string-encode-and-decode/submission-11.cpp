class Solution {
public:

    string encode(vector<string>& strs) {
        string eRes="";
        for(auto i:strs){
            eRes+=i+"%20#";
        }
        return eRes;
    }

    vector<string> decode(string s) {
        vector<string>dRes;
        if(s.empty()){return {};}
        int i=0;
        for(int j=0;j<s.size()-3;j++){
            if(s.substr(j,4)=="%20#"){
                dRes.push_back(s.substr(i,j-i));
                i=j+4;
            }
        }
        return dRes;
    }
};
