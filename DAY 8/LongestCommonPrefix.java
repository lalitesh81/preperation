class Solution {
    public String longestCommonPrefix(String[] strs) {
         StringBuffer w = new StringBuffer();
        if(strs.length == 0 )
            return w.toString();
        if(strs.length == 1)
            return strs[0];
        String s = strs[0];
       
        for(int i=0;i<s.length();i++){
            w.append(s.charAt(i));
            for(int j=1;j<strs.length;j++){
                if(strs[j].startsWith(w.toString())){
                    continue;
                    
                }
                else
                    return w.substring(0,w.length()-1);
            }
        }
        
         return w.substring(0,w.length());
        
    }
}