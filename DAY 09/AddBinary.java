class Solution {
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        
        int a1= a.length()-1;
        int b1= b.length()-1;
        
        int carry=0;
        
        int an=0;
        int bn =0;
        while(a1 >= 0 || b1 >= 0 ){
            if(a1>=0)
             an = a.charAt(a1) - '0';
            if(b1>=0)
             bn = b.charAt(b1) - '0';
              
            sb.append(an^bn^carry);
            
            carry =  (an & bn) | (carry & an) | (carry & bn);
           
          
            an=0;
            bn=0;
           
            a1--;
            b1--;
        }
        if(carry ==  1)
            sb.append(carry);
        sb.reverse();
        return sb.toString();
    }
}