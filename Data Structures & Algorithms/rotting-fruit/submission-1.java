class Solution {
    public int orangesRotting(int[][] grid) {

        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        int ROW=grid.length;
        int COL=grid[0].length;
        Queue<int[]> q=new LinkedList<>();
        int freshFruit=0;
        int time=-1;


        for(int i=0;i<ROW;i++){
            for(int j=0;j<COL;j++){
                if(grid[i][j]==1) freshFruit++;
                if(grid[i][j]==2) q.add(new int[]{i,j});
            }
        }

        if(freshFruit==0) return 0;
        while(!q.isEmpty()){
            int size=q.size();

            for(int i=0;i<size;i++){
                int[] node=q.poll();
                int r=node[0];
                int c=node[1];

                for(int[] d:dir){
                    int row=r+d[0];
                    int col=c+d[1];

                    if(row<ROW && col<COL && row>=0 && col >=0 && grid[row][col]==1 ){
                        grid[row][col]=2;
                        freshFruit--;
                        q.add(new int[]{row,col});
                    }
                }
            }
            time++;
        }
        if(freshFruit!=0) return -1;
        return time;

    }
}
