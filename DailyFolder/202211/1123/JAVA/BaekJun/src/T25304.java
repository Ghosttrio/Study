

import java.util.Scanner;

public class T25304{
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		int n = s.nextInt();
		
		int c = 0;
		
		for(int i=1; i<=n; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			c+=a*b;
		}
		
		if(x==c) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}