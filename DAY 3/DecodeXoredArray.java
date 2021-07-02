import java.util.Scanner;

public class DecodeXoredArray {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int [] encoded = new int[n];
		for(int i=0;i<n;i++)
			encoded[i] = sc.nextInt();
		int first = sc.nextInt();
		
		 int [] temp = new int[encoded.length+1];
	        temp[0] = first;
	        for(int i=0;i<encoded.length;i++){
	            temp[i+1] = temp[i] ^encoded[i]; 
	        }
	        for(int i:temp)
	        	System.out.println(i);
	}

}
