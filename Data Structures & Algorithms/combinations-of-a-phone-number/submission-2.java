class Solution {

    String[] p={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res=new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return res;
        dfs(0,"",digits);
        return res;
    }

    void dfs(int i, String cur, String d){
        if(cur.length()==d.length()){
            res.add(cur);
            return;
        }

        String chars=p[d.charAt(i)-'0'];
        for(char c:chars.toCharArray()){
            
            dfs(i+1,cur+c,d);
            
        }
    }
}
