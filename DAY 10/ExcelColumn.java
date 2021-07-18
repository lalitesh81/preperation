class Solution {
    public String convertToTitle(int columnNumber) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb= new StringBuilder();
        
        while(columnNumber > 0){
           columnNumber --;
           int i = columnNumber % 26 ;
            sb.append(s.charAt(i));
            columnNumber = columnNumber / 26;
        }
        sb.reverse();
       return sb.toString();
        
    }
}

