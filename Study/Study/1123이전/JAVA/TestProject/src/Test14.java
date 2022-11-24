import java.util.Scanner;

public class Test14 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int i=2;
		long y=1;
		
		while(i<n) {
			y*=n%i;	
			i++;
			if(i==n) {
				if(y==0) {
					System.out.println("소수가 아닙니다.");
				} else {
					System.out.println("소수입니다.");
				}
			}
		} 
		if(n==2) {
			System.out.println("소수입니다.");
		}

	}
}
/*
 * 소수(Prime Number) 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
 * 1 or n
 * 		% 
			/
			1 , n
			2~x-1 한번이라도 0으로 떨어지면 소수가 아니다
 */