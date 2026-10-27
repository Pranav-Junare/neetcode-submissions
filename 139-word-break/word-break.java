class Solution {
    Boolean memo[];
    public boolean wordBreak(String s, List<String> wordDict) {
        memo=new Boolean[s.length()];
        return dfs(0, s,wordDict);
    }
    boolean dfs(int i, String s, List<String>wd){

        if(i==s.length())return true;

        if(memo[i]!=null)return memo[i];
        char firstElement = s.charAt(i);
        for(String word:wd)
            if(s.startsWith(word, i))
                if(dfs(i+word.length(), s, wd)) return memo[i]=true; 
        
        return memo[i]=false;
    }
}