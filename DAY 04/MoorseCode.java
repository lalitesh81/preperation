import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MoorseCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		String [] words = new String[n];
		
		for(int i=0;i<n;i++)
			words[i] = sc.next();
		
		
	     HashSet<String> se = new HashSet<String>();
	        
	        String [] st = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	     
	        HashMap<Character, String> hs = new HashMap<>();
	        for (int i = 0; i < st.length; i++) {
	              hs.put(((char) (i+97)),st[i] );
	            }
	        
	       
	        
	        for(String s: words){
	            String w ="";
	            char [] ch = s.toCharArray();
	            for(char c : ch){
	                w += hs.get(c);
	            }
	            se.add(w);
	        }
	       System.out.println(se.size());
	          
 
	}

}
