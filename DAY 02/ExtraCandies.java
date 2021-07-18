import java.util.ArrayList;
import java.util.Scanner;


public class ExtraCandies {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int [] candies = new int[n];
		for(int i=0;i<n;i++)
			candies[i] = sc.nextInt();
		int extraCandies = sc.nextInt();
		
		  ArrayList<Boolean> al = new ArrayList<Boolean>();
		  
	        int max=0;
	        for(int i=0;i<candies.length;i++){
	            if(candies[i]>max)
	                max=candies[i];
	        }
	        
	        for(int i=0;i<candies.length;i++){
	            if(candies[i]+extraCandies>=max)
	                al.add(true);
	            else
	                al.add(false);
	        }
	       for(boolean b:al)
	    	   System.out.print(b + " ");
	}

}
