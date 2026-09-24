class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set=new HashSet<>();
        int x=0;int y=0;
        set.add(x+","+y);

        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N')
                x++;
            
            else if(path.charAt(i)=='S')
                x--;            
            else if(path.charAt(i)=='E')
                y++;
            
            else if(path.charAt(i)=='W')
                y--;
            
            if(set.contains(x+","+y))return true;
            set.add(x+","+y);
        }
        return false;
    }
}