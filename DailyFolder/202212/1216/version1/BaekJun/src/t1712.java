import java.util.Scanner;

public class t1712 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if(c<=b) {
			System.out.println("-1");
		} else {
			System.out.println(a/(c-b)+1);
		}
		s.close();
	}
}
