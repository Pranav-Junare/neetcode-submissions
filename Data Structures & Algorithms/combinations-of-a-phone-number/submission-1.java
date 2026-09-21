class Solution {

    String[] p={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> res=new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())return res;
        dfs(0,"",digits);
        return res;
    }

    void dfs(int i,String curr,String digits){
        if(curr.length()==digits.length()){
            res.add(curr);
            return;
        }

        String chars=p[digits.charAt(i)-'0'];

        for(char c:chars.toCharArray()){
            dfs(i+1, curr+c,digits);
        }
    }
}
