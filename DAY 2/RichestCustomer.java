import java.util.Scanner;

public class RichestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int r = sc.nextInt();
		int c=sc.nextInt();
		int [][] arr = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		int max = 0;
		int ind =0;
		for(int i=0;i<r;i++) {
			int sum = 0;
			for(int j=0;j<c;j++) {
				
				sum += arr[i][j];
			}
			if(sum>max) {
				ind = i;
				max=sum;
			}
		}
		System.out.println("Richest customer "+ (ind+1));
			

	}

}
