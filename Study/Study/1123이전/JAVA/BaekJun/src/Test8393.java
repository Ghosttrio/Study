

import java.util.Scanner;

public class Test8393{
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int i;
		int a=0;
		for(i=1;i<=n;i++) {
			
			a+=i;
		}
		System.out.println(a);
	}
}