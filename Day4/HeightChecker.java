import java.util.Arrays;
import java.util.Scanner;

public class HeightChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int c=0;
		int temp[] = arr.clone();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != temp[i])
				c++;
		}
		System.out.println(c);

	}

}
