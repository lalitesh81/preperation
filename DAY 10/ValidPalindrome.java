class Solution {
    public boolean isPalindrome(String s) {   
        s = s.toLowerCase();
        int l=0;
        int h=s.length()-1;
        
        while(l<h){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l++;
                continue;
            }
            
            if(!Character.isLetterOrDigit(s.charAt(h))){
                h--;
                continue;
            }
            if(s.charAt(h) != s.charAt(l))
                return false;
            else{
                l++;
                h--;
            }
        }
        return true;
      
            
    }
}
