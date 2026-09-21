class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int>stk;
        for(string token:tokens){
            if(token == "+" || token == "-" || token == "*" || token == "/"){
                int e1=stk.top();
                stk.pop() ;
                int e2=stk.top(); 
                stk.pop() ;
                if(token == "+") stk.push(e2+e1);
                else if(token == "-") stk.push(e2-e1);
                else if(token == "*" )stk.push(e2*e1);
                else if(token == "/" )stk.push(e2/e1);
            }
            else stk.push(stoi(token));
        }
        return stk.top();
    }
};
