class Solution {
    public String reformatDate(String date) {
        
        StringBuilder sb = new StringBuilder();
        Map<String,String> mon = new HashMap<>();
        mon.put("Jan" ,"01");
        mon.put("Feb" ,"02");
        mon.put("Mar" ,"03");  
        mon.put("Apr" ,"04");
        mon.put("May" ,"05");
        mon.put("Jun" ,"06");
        mon.put("Jul" ,"07");
        mon.put("Aug" ,"08");
        mon.put("Sep" ,"09");
        mon.put("Oct" ,"10");
        mon.put("Nov" ,"11");
        mon.put("Dec" ,"12");
        
        String [] str = date.split(" ");
        
       
            
            sb.append(str[2]);
            sb.append("-");
        
          sb.append(mon.get(str[1]));
          sb.append("-");
        
        String s = str[0];
        if(s.charAt(1) == 't'  || s.charAt(1) == 's'||s.charAt(1) == 'n'||s.charAt(1) == 'r')
            sb.append("0" + s.charAt(0));
        else
            sb.append(s.substring(0,2));
                      
                      
                      
        
        return sb.toString();    
    }
}