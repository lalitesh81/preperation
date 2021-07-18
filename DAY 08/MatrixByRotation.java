class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            mat = rotate(mat);
            if(Arrays.deepEquals(mat,target))
                return true;
        }
        return false;
        
    }
    
    private int[][] rotate(int [][]mat){
        int r=mat.length;
        int[][] newmat = new int[r][r];
      
        for(int i=0;i<r;i++){
              int k=0;
            for(int j=r-1;j>=0;j--){
                newmat[i][k++] = mat[j][i]; 
            }
        }
        return newmat;
    }
    

}