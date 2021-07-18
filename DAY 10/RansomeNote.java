class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if(ransomNote.length() > magazine.length())
            return false;
        if(ransomNote.length() == magazine.length() && ransomNote.equals(magazine))
            return true;
       
        
        char [] c1 = ransomNote.toCharArray();
        char [] c2 = magazine.toCharArray();
        int i=0,c=0;
        while(i<ransomNote.length()){
            for(int j=0;j<magazine.length();j++){
                if(c1[i] == c2[j]){
                    c++;
                    c2[j] = 'A';
                    i++;
                    break;
                }
                else
                    c=0;
            }
            if(c==0)
                return false;
        }
        return true;
        
    }
}