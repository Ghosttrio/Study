import java.util.Scanner;

public class Test17 {
	
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڸ� �Է��Ͻÿ�. : ");
		String B = a.nextLine();
		int D = Integer.parseInt(B);
		System.out.print("�� ��° ���ڸ� �Է��Ͻÿ�. : ");
		String C = a.nextLine();
		int E = Integer.parseInt(C);
		System.out.println("�հ� : " + (D + E));
		System.out.println("���α׷��� �����մϴ�.");

	}
}