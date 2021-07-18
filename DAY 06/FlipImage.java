class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r= image.length;
        int c= image[0].length;
        int col =0;
        if(c%2 == 0)
            col=1;
        for(int i=0;i<r;i++){
            int s=0;
            int l=c-1;
            while(s<l){
                int temp = image[i][l] ^ 1;
                image[i][l] = image[i][s] ^ 1;
                image[i][s] = temp;
                s++;
                l--;
                
            }
            if(col == 0){
                image[i][s] = image[i][s] ^ 1;
            }
        }
        return image;
        
    }
}