import java.util.Scanner;

public class SpecialNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int r = sc.nextInt();
		int c=sc.nextInt();
		int [][] arr = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		int tr=0;
		int tc=0;
		
		for(int i=0;i<r;i++) {
			int min = Integer.MAX_VALUE;
			int co=0;
			for(int j=0;j<c;j++) {
				if(arr[i][j] < min) {
					min = arr[i][j];
					tr =i;
					tc=j;
					
				}
			}
			
			for(int k=tr-1;k>=0;k--) {
				if(arr[k][tc] > min) {
					co=1;
					break;
				}
			}
			
			for(int k=tr+1;k<r;k++) {
				if(arr[k][tc] > min) {
					co=1;
					break;
				}
			}
			
			if(co == 0) {
				System.out.println(arr[tr][tc] + " is Special");
				break;
			}
		}

	}

}
