class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        
        if(n != m)
            return false;
        
        char [] c1 = s.toCharArray();
        char [] c2 =t.toCharArray();
        
        Arrays.sort(c1);
        Arrays.sort(c2);
        
        s = String.valueOf(c1);
        t = String.valueOf(c2);
        
        return s.equals(t);
       
        
      
        
       
    }
}