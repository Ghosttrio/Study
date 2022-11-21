
import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int x = 2;
		int n = 4;
		int i = 1;
		
		while(i<n) {
			x*=2;
			i++;
		}
		
		System.out.println(x);
	}
}