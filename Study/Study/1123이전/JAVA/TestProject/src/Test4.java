import java.util.Scanner;

//�̸�, ���ø�, ����Ϲ�ȣ �Է¹ް� ���

public class Test4 {

	public static void main(String[] args) {
		
		Scanner b = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ� : ");
		String str1 = b.nextLine();
		System.out.print("���ø��� �Է��Ͻÿ� : ");
		String str2 = b.nextLine();
		System.out.print("����Ϲ�ȣ�� �Է��Ͻÿ� : ");
		String str3 = b.nextLine();
		
		System.out.println(str1 + "�� " + str2 + "�� ���, " + "����Ϲ�ȣ�� " + str3 + "�Դϴ�.");
		
	}
	
}