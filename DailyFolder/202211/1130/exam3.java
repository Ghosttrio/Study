package expert1;
import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("10~99 ������ ���ڸ� �Է� : ");
		int n = s.nextInt();
		int n_10 = n / 10; //int�� ������ �̿�
		int n_1 = n % 10;
		if(n_10 == n_1) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
//		if(n % 11 == 0) {
//			System.out.println("����");
//		} else {
//			System.out.println("�ٸ���");
//		}
//		
		
		
		
		
	}

}
