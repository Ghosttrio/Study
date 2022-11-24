import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a name: ");
		String name = s.nextLine();
		
		switch(name) {
		
		case "John":
			System.out.println("name is "+name);
			
		break;
		case "Jane":
			System.out.println("name is "+name);
		
			break;
		case "Jacob":
			System.out.println("name is "+name);
		
			break;
		default :
			System.out.println("unknown name: "+name);
		
		}
		s.close();
		
		
	}
	
}
