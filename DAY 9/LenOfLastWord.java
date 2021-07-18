class Solution {
    public int lengthOfLastWord(String s) {
        if(s.isEmpty())
         return 0;
        s=s.trim();
        int n=s.lastIndexOf(' ');
        String s1= s.substring(n+1);
        return s1.length();
    }
}