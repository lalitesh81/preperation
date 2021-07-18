import java.util.ArrayList;
import java.util.Scanner;

//nth weakest Hospital

public class WeakHospital {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int r = sc.nextInt();
		int c=sc.nextInt();
		int n=2;
		int [][] arr = new int[r][c];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				if(arr[j][i] == 0) {
					if(!al.contains(j))
						al.add(j);
				}
			}
		}
		if(al.size()!=r){
            for(int i=0;i<r;i++){
                if(!al.contains(i))
                    al.add(i);
            }
        }
		for(int i=0;i<n;i++) {
			System.out.print(al.get(i) + " ");
		}
		
		
		
		
	}
}
