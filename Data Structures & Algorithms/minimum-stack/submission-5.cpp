class MinStack {
public:
        stack<int>ms;
        stack<int>s;
    MinStack() {
    }
    
    void push(int val) {
        s.push(val);
        ms.push(min(val,ms.empty()?val:ms.top()));
    }
    
    void pop() {
        s.pop();
        ms.pop();
    }
    
    int top() {
        return s.top();
    }
    
    int getMin() {
        return ms.top();
    }
};
