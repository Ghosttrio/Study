import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("a의 값을 입력하시오: ");
		double a = s.nextDouble();
		System.out.print("b의 값을 입력하시오: ");
		double b = s.nextDouble();
		System.out.print("c의 값을 입력하시오: ");
		double c = s.nextDouble();
		
		System.out.println("x1: " + ((-1*b)+Math.sqrt((b*b)-(4*a*c)))/(2*a));
		System.out.println("x2: " + ((-1*b)-Math.sqrt((b*b)-(4*a*c)))/(2*a));
		
	}

}
