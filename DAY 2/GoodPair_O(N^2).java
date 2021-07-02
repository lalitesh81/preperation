
import java.util.Scanner;

public class GoodPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    	 Scanner sc = new Scanner(System.in);
		    	 int n=sc.nextInt();
		        int arr[] = new int [n];
		        for(int i=0;i<n;i++) {
		        	arr[i]= sc.nextInt();
		        }
		        int c=0;
		        for(int i=0;i<arr.length;i++){
		            for(int j=i+1;j<arr.length;j++){
		                if (arr[i]==arr[j] ){
		                    c++;
		                }
		            }
		        }
		        System.out.println(c);
		       
	}

}
