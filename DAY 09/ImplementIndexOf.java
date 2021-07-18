class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0)
            return 0;
        int j=0;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i) == needle.charAt(j)){
                if(haystack.startsWith(needle,i))
                    return i;
            }
        }  
        return -1;
    }
}

