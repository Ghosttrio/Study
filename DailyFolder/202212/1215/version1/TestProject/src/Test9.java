import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		if(x>=90) {
			System.out.println("A");
		} else if(x>=80) {
			System.out.println("B");
		} else if(x>=70) {
			System.out.println("C");
		} else if(x>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
	}

}
