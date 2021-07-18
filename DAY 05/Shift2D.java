class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int r = grid.length;
        int c= grid[0].length;
        int total = r*c;
        int arr[] = new int [total];
        int n=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[n++] = grid[i][j];
            }
        }
        k=k%(total);
        while(k>0){
       int temp = arr[total-1];
        for(int i=total-2;i>=0;i--){
             
            arr[i+1] = arr[i];
            
        }
        arr[0] = temp;
            k--;
        }
        List<List<Integer>> shifted =  new ArrayList<>();
       ArrayList<Integer> al = new ArrayList<>();
		
        
         for(int i=0;i<arr.length;i=i+c){
	             for(int j=i;j<c+i;j++){
	                 al.add(arr[j]);
	             }
	              shifted.add(al);
	              al=new ArrayList<>();
	                 
	          }
        return shifted;
        
    }
}