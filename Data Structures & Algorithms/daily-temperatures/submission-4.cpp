class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temperatures) {
        int n=temperatures.size();
        vector<int>res(n,0);
        stack<int>stk;

        for(int i=0;i<n;i++){
            while(!stk.empty() && temperatures[i]>temperatures[stk.top()]){
                int prev=stk.top();
                stk.pop();
                res[prev]=i-prev;
            }
            stk.push(i);
        }
        return res;
    }
};
