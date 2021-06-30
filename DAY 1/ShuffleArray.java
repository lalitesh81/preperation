

import java.util.Scanner;

public class ShuffleArray {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		
	
		 int temp[] = new int[n];
		int i=0;
		int k=0;
		int j=n/2;
		while(i<n/2) {
			temp[k++] = arr[i++];
			temp[k++]= arr[j++];
			
		}for(int m:temp)
		System.out.print(m + " ");
	}
	
}

	
	


