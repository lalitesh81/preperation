class Solution {
    public String addStrings(String num1, String num2) {
        StringBuffer sb = new StringBuffer();
        
        int carry =0;
        
        int n1= num1.length()-1;
        int n2=num2.length()-1;
        
        int a=0;
        int b=0;
        
        while(n1 >= 0 || n2 >=0){
            if(n1 >= 0)
                a = num1.charAt(n1) - '0';
            if(n2 >= 0)
                b = num2.charAt(n2) - '0';
            
            int sum =a+b+carry;
            
            sb.append(sum % 10);
            carry = sum/10;
            
            a=0;
            b=0;
            
            n1--;
            n2--;
                
        } 
        if(carry != 0)
            sb.append(carry);
        sb.reverse();
        return sb.toString();
        
    }
}