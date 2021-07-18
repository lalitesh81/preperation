class Solution {
    public String[] findWords(String[] words) {
        List<Character> one  = new ArrayList<>(List.of('q','w','e','r','t','y','u','i','o','p'));
        List<Character> two  = new ArrayList<>(List.of('a','s','d','f','g','h','j','k','l'));
        List<Character> three  = new ArrayList<>(List.of('z','x','c','v','b','n','m'));
           
        List<String>  s = new ArrayList<>();
        
        for(String s1 : words){
            int o=0,t=0,th =0;
            String temp = s1;
             s1 =  s1.toLowerCase();
            for(char c:s1.toCharArray()){
                if(one.contains(c) && t ==0 && th ==0){
                    o++;
                }
                else if(two.contains(c) && o ==0 && th ==0)
                    t++;
                else if(three.contains(c) && o==0 && t==0)
                    th++;
                else
                    break;
            }
            if(s1.length() == o || s1.length() == t || s1.length() == th)
                s.add(temp);
        }
        String [] arr = new String[s.size()];
        for(int i=0;i<s.size();i++){
            arr[i] = s.get(i);
        }
        return arr;   
    }
}