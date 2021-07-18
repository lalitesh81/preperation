class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> al = new ArrayList<>();
        int [] arr= new int[s.length()];
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c)
                al.add(i);
        }
        
       
        
        for(int i=0;i<s.length();i++){
             int min = Integer.MAX_VALUE;
            for(int j=0;j<al.size();j++){
                int n =Math.abs(i-al.get(j));
                if(n < min)
                    min = n;
            }
            arr[i] = min;
            
        }
        return arr;
        
    }
}