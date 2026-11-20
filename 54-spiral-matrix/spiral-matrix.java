class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res=new ArrayList<>();

        int top = 0;
        int left = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;

        while(top<=bottom && left<=right){
            // Top iteration 
            for(int i=left;i<=right;i++){
                res.add(matrix[top][i]);
            }
            top++;

            // Right iteration
            for(int i=top; i<=bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;

            // Bottom iteration
            if (top <= bottom){
                for(int i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // Left iteration
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}