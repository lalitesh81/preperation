import java.util.ArrayList;
import java.util.Scanner;

public class TargetArray {
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr = new int[n];
		int [] index = new int[n];
		System.out.println("array");
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		System.out.println("index array");
		for(int i=0;i<n;i++)
			index[i] = sc.nextInt();
		 ArrayList<Integer> al = new ArrayList<Integer>();
	        for(int i=0;i<arr.length;i++){
	            al.add(index[i],arr[i]);
	        }
	        
	        for(int i:al)
	        	System.out.print(i + " ");
	        
	        
	   
	}
}
