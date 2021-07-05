class Solution {
    public int projectionArea(int[][] grid) {
        int r=grid.length;
        int c = grid[0].length;
        int up = r*c;
        int front = 0;
        int zero =0;
        for(int i=0;i<r;i++){
            int maxr = 0;
            int maxc = 0;
            for(int j=0;j<c;j++){
                if(grid[i][j] == 0){
                    zero++;
                   
                }
                if(grid[i][j] > maxr)
                    maxr = grid[i][j];
                if(grid[j][i] > maxc)
                    maxc = grid[j][i];
                
            }
            front += maxr+maxc;
        }

        
        return up+front-zero;
    }
}