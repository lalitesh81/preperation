class Solution {
    public String thousandSeparator(int n) {
        
     StringBuffer s =new StringBuffer(Integer.toString(n));
      
        
        int index = s.length()-3;
        
        while(index >= 1){
            s.insert(index, '.');
            index=index-3;
        }
        return s.toString();
        
        
    }
}