import java.util.Scanner;

public class truncateSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int k = sc.nextInt();
		   
        String [] at = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<k;i++){
            sb.append(at[i]);
            sb.append(" ");
        }
       System.out.println(sb.substring(0,sb.length()-1));
        
	}

}
