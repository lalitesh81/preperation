class Solution {
    static boolean isVowel(char c) { 
        return (c == 'a' || c == 'A' || c == 'e'|| c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'|| c == 'U'); 
                
    } 
    public String reverseVowels(String s) {
        int h=0;
        int e=s.length()-1;
        char []ch=s.toCharArray();
        while(h<e){
              if (!isVowel(ch[h])) 
        { 
            h++; 
            continue; 
        } 
        if (!isVowel(ch[e])) 
        { 
            e--; 
            continue; 
        } 
  
      
        char t = ch[h]; 
        ch[h]= ch[e]; 
        ch[e]= t; 
          
  
        h++; 
        e--; 
    } 
    String str2 = String.copyValueOf(ch); 
    return str2; 
        }
    
}