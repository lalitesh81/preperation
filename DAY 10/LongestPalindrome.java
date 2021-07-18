class Solution {
    public int longestPalindrome(String s) {
        
         
    if(s.length()==0)
        return 0;
    
    int [] arr  = new int[52];
        
       for(char c:s.toCharArray()){
           int ind=0;
           if(c >= 'A' && c <= 'Z')
               ind = c-'A'+26;
           else
               ind = c-'a';
           arr[ind]++;
           
       }

    
    int oddCount = 0;
    for(int i=0;i<arr.length;i++){
        
        if(arr[i] % 2 == 1)
            oddCount++;
    }
    if(oddCount<=1)
            return s.length();
    else
        return s.length() - oddCount + 1;
        
        
    }
}