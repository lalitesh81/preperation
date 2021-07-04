class Solution {
    public int islandPerimeter(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int per = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == 1){
                    if(i == 0 || grid[i-1][j] == 0 )
                        per++;
                    if(i == r-1 || grid[i+1][j] == 0 )
                        per++;
                    if(j == 0 || grid[i][j-1] == 0 )
                        per++;
                    if(j == c-1 || grid[i][j+1] == 0 )
                        per++;
                    
                }
            }
        }
        return per;

    }
}