import java.util.ArrayList;
import java.util.Scanner;

public class RunLength {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int [] nums = new int[n];
		for(int i=0;i<n;i++)
			nums[i] = sc.nextInt();
		
		 ArrayList<Integer> al = new ArrayList<Integer>();
	        for(int i=0;i<nums.length-1;i=i+2){
	                while(nums[i]>0){
	                    al.add(nums[i+1]);
	                    nums[i]--;
	                    
	                }
	            
	            
	        }
	        for(int i:al)
	        	System.out.print(i + " ");
	       
	     
	}
}
