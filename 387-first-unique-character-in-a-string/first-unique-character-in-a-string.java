class Solution {
    public int firstUniqChar(String s) {
        Set<Character> set=new HashSet<>();

        if(s.length()==1)return 0;

        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i)))continue;
            int currOcc = 1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){currOcc++;break;}
            }
            set.add(s.charAt(i));
            if(currOcc==1)return i;

        }
        return -1;
    }
}