import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int n = s.nextInt();
		int i = 1;
		int k = x;
		
		for(i=1;i<n;i++) {
			x*=k;
		}
		
		System.out.println(k+"의 "+n+"제곱은 "+x);
		
	}
}