import java.util.Scanner;

public class If1 {

	public static void main(String[] args) {
		
		Scanner c = new Scanner(System.in);

		System.out.print("Name : ");
		String a = c.nextLine();
		
		System.out.print("Name : ");
		String b = c.nextLine();
		
		if(a.equals(b)) {
		
		System.out.println("Condition is true");
		
		} else {
		
		System.out.println("Condition is false");
		}
		System.out.println("if was ended");
	}

}