class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        HashMap<String, Integer> freq = new HashMap<>();
        
        paragraph  = paragraph.replaceAll("\\p{Punct}"," ");
        
        paragraph = paragraph.toLowerCase();
        
        String [] str = paragraph.split("\\s+");
        
        HashSet<String> hs= new HashSet<>();
        
        for(String s:banned){
            hs.add(s);
        }
        
        int max =0;
        String s1 = "";
        for(String s : str){
            if(hs.contains(s))
                continue;
            int f = freq.getOrDefault(s, 0)+1;
            freq.put(s,f);
            if(f > max){
                max = f;
                s1=s;
            }
        }
        
        return s1;
        
    }
}

