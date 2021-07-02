import java.util.HashSet;
import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("string");
		String allowed = sc.next();
		int n = sc.nextInt();
		System.out.println("words");
		String [] words = new String[n];
		for(int i=0;i<n;i++) {
			words[i] = sc.next();
		}
		 HashSet<Character> hs = new HashSet<Character>();
	        for(int i=0;i<allowed.length();i++){
	            hs.add(allowed.charAt(i));
	        }
	        int c=0;
	        for(String s:words){
	            int l= s.length();
	            for(int i=0;i<l;i++){
	                if(hs.contains(s.charAt(i))){
	                    if(i+1==l)
	                        c++;
	                }
	                    
	                else
	                    break;
	            }
	            
	        }

	        	System.out.println(c);

	}

}
