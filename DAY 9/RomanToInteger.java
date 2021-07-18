class Solution {
    
    private int RtoI(char ch){
        switch(ch){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
        }
        return 0;
    }
    public int romanToInt(String s) {
       
        int num =0;
        
       
        for(int i=0;i<s.length()-1;i++){
           int j = RtoI(s.charAt(i));
           int k = RtoI(s.charAt(i+1));
            if(j<k){
                num = num - j;
             
            }
            else
                num = num + j;
            
        }
        
           num  = num +  RtoI(s.charAt(s.length()-1)); 
        return num;
        
    }
}


