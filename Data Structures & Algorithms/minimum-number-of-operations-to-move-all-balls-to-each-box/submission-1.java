class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            int total=0;
            for (int j=0;j<n;j++){
                if(boxes.toCharArray()[j]=='1') total+=Math.abs(i-j);
            }
            res[i]=total;
        }
        return res;
    }
}