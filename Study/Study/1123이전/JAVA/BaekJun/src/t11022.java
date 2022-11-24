import java.util.Scanner;

public class t11022 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		for(int i=1; i<=t; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = a+b;
			System.out.println("Case #"+i+": "+a+" + "+b+" = "+c);
		}
		
	
	}
}