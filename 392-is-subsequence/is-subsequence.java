class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length())return false;

        int counter=0;

        for(int i=0;i<t.length();i++){
            if(counter>=s.length())break;
            if(s.charAt(counter)==t.charAt(i))counter++;
        }
            if(counter>=s.length())return true;
        return false;
    }
}