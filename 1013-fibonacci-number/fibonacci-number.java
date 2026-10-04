class Solution {
    int [] memo;
    public int fib(int n) {
        memo=new int[n+1];
        Arrays.fill(memo,-1);
    
        if(n<=1)return n;
        if(memo[n]!=-1)return memo[n];
        return fib(n-1)+fib(n-2);
    }
}