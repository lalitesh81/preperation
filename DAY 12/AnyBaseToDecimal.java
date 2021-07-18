import java.util.Scanner;

public class AnyBaseToDecimal {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter a number");
		double d = sc.nextDouble();
		
		System.out.println("enter base");
		int base = sc.nextInt();	
		String s = String.valueOf(d);
		int index = s.indexOf(".");
		
		String intp= s.substring(0, index);
		String decp= s.substring(index+1);
		
		double sum =0;
		int p=0;
		for(int i=intp.length()-1;i>=0;i--) {
			sum = sum+(s.charAt(i) - '0')*Math.pow(base, p++);
		}
		
		
		double dsum=0;
		int k=-1;
		for(int i=1;i<=decp.length();i++) {
			dsum = dsum+(s.charAt(i) - '0')*Math.pow(base, k--);
			
		}
		
		System.out.println(sum+dsum);
	}
}
