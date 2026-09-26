class Solution {
    public int minCostToMoveChips(int[] position) {
        
        int minCost=Integer.MAX_VALUE;

        for(int i=0;i<position.length;i++){
            int tempSum=0;
            int tempCost=0;
            for(int j=0;j<position.length;j++){
                tempSum=Math.abs(position[i]-position[j]);

                if(tempSum % 2 != 0) tempCost++;

            }
            minCost=Math.min(minCost, tempCost);
        }
        return minCost;
    }
}