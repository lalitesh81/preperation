class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        
        ArrayList<String> al = new ArrayList<>();
        
        for(int i=0;i<12;i++){
            for(int j=0;j<60;j++){
                if(hammingWeight(i) + hammingWeight(j) == turnedOn){
                    al.add(String.format("%d:%02d", i, j));
                }
                    
            }
        }
        return al;
        
    }
    
    private int hammingWeight(int n){
        int count =0;
        
        while(n!=0){
            count++;
            n=n & (n-1);
        }
        
        return count;
    }
}