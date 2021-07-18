class Solution {
    public String reverseOnlyLetters(String S) {
       int n= S.length();
        char [] ch = S.toCharArray();
        
        int l=0;
        int e=n-1;
        
        while(l<=e){
            if(Character.isLetter(ch[l])){
                if(Character.isLetter(ch[e])){
                    char c= ch[e];
                    ch[e] = ch[l];
                    ch[l] = c;
                    l++;
                    e--;
                }
                else
                    e--;
                    
            }
            else
                l++;
        }
        String str = new String(ch);
        return str;
    }
}