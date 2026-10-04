class Solution {
    int [] memo;
    public int fib(int n) {
        memo=new int[n+1];
        if(n==0)return 0;
        if(n==1)return 1;
        if(memo[n]!=0)return memo[n];
        return fib(n-1)+fib(n-2);
    }
}