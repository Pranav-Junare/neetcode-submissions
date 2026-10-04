class Solution {
    
    public int fib(int n) {
        int [] memo=new int[n+1];
        Arrays.fill(memo,-1);
        return fib(n,memo);
    }
    int fib(int n, int[]memo){
        if(n<=1)return n;
        if(memo[n]!=-1) return memo[n];
        return memo[n]=fib(n-1,memo)+fib(n-2,memo);
    }
}