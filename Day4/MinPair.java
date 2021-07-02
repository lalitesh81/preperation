import java.util.Arrays;
import java.util.Scanner;

public class MinPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
	
		Arrays.sort(arr);
		int max=0;
		for(int i=0;i<arr.length-1;i=i+2) {
			max += arr[i];
		}
		System.out.println(max);
		

	}

}
