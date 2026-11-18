// class Solution {
//     public void setZeroes(int[][] matrix) {
//         // First intuition is iterate through the array, and when ever i see a 0, for the row change the [x][i] do a for loop on the row and kepe everything to 0, keep a set of visited nodes and the nodes that are really 0, taki repeated or wrong row and column are not set to 0 by mistake

//         // Get the length of the ROW and COL so that continously i dont have to look it up
//         int ROW=matrix.length;
//         int COL=matrix[0].length;

//         // A set to keep track of orignal 0s in the matrix and also add that in the set
//         Set<Pair<Integer, Integer>> original=new HashSet<>();
//         for(int i=0;i<ROW;i++){
//             for(int j=0;j<COL;j++){
//                 if(matrix[i][j]==0)original.add(new Pair<>(i,j));
//             }
//         }

//         // Now since the set has all the values of the original 0s in the array, we go and iterate over the matrix, if we find a 0 set all the rows in it to 0 and also check if the number is in the set or not

//         for(int i=0;i<ROW;i++){
//             for(int j=0;j<COL;j++){
//                 if(matrix[i][j]==0 && original.contains(new Pair<>(i,j))){
//                     dfs(i, j, ROW, COL, matrix);
//                 }
//             }
//         }
//     }
// // DFS to put all the numbers to 0
//     void dfs(int row, int col, int ROW, int COL, int[][] matrix){

//         // Base return condition
//         if(row>=ROW || col>= COL || row<0 || col<0) return;

//         // 1st to put all the 0s in the col to 0
//         for(int i=0;i<ROW;i++){
//             matrix[i][col]=0;
//         }

//         // Now to set all the values row to 0
//         for(int i=0;i<COL;i++){
//             matrix[row][i]=0;
//         }
//     }
// }
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // 1. Check if first row/col have original zeros
        for (int j = 0; j < n; j++) if (matrix[0][j] == 0) firstRowZero = true;
        for (int i = 0; i < m; i++) if (matrix[i][0] == 0) firstColZero = true;

        // 2. Mark the first row and col
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // 3. Zero out based on markers (ONE combined loop!)
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                // If the row marker OR the col marker is 0, zero the cell
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 4. Clean up the first row/col using the flags
        if (firstRowZero) {
            for (int j = 0; j < n; j++) matrix[0][j] = 0;
        }
        if (firstColZero) {
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
        }
    }
}