import java.util.Scanner;

public class ShuffleString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int [] indices = new int[s.length()];
		for(int i=0;i<s.length();i++)
			indices[i] = sc.nextInt();
		 char [] ch = new char[s.length()];
	        
	        for(int i=0;i<s.length();i++){
	            ch[indices[i]]=s.charAt(i);
	        }
	        for(char c:ch)
	        	System.out.print(c);
	}
}
