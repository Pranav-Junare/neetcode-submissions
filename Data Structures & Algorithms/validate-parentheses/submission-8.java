class Solution {
    public boolean isValid(String str) {
        Stack<Character> stack=new Stack<>();
        Map<Character, Character>m=new HashMap<>();
        m.put(')','(');
        m.put(']','[');
        m.put('}','{');

        for(Character s:str.toCharArray()){
            if(m.containsKey(s)){
                if(!stack.isEmpty() && stack.peek()==m.get(s))
                    stack.pop();
                else
                    return false;
                }
            else stack.push(s);
        }
        return stack.isEmpty();
    }
}
