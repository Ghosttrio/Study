import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("a�� ���� �Է��Ͻÿ�: ");
		double a = s.nextDouble();
		System.out.print("b�� ���� �Է��Ͻÿ�: ");
		double b = s.nextDouble();
		System.out.print("c�� ���� �Է��Ͻÿ�: ");
		double c = s.nextDouble();
		
		System.out.println("x1: " + ((-1*b)+Math.sqrt((b*b)-(4*a*c)))/(2*a));
		System.out.println("x2: " + ((-1*b)-Math.sqrt((b*b)-(4*a*c)))/(2*a));
		
	}

}
