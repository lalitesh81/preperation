import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int val = sc.nextInt();
		
		int c=0;
		int i=0;
		for(int j=0;j<n;j++) {
			if(arr[j] != val) {
				arr[i] = arr[j];
				i++;
			}
		}
		System.out.println(i);
	}

}
