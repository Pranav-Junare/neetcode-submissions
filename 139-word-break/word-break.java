class Solution {
    Boolean memo[];
    public boolean wordBreak(String s, List<String> wordDict) {
        memo=new Boolean[s.length()+1];

        return dfs(s, 0, wordDict);
    }

    boolean dfs(String s, int i, List<String> wordDict){
        if(i==s.length()) return true;

        if(memo[i]!=null)return memo[i];

        for(String word:wordDict)
            if(s.startsWith(word, i)) 
                if(dfs(s, i+word.length(),wordDict))
                     return memo[i]=true;
        return memo[i]=false;
    }
}