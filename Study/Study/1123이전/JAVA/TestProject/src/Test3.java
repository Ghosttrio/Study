import java.util.Scanner;

//���� ������ �о abc
//a+b*c�� ����� ���
public class Test3 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		
		System.out.print("ù ��° ���ڸ� �Է��Ͻÿ� : ");
		int i1 = a.nextInt();

		System.out.print("�� ��° ���ڸ� �Է��Ͻÿ� : ");
		int i2 = a.nextInt();

		System.out.print("�� ��° ���ڸ� �Է��Ͻÿ� : ");
		int i3 = a.nextInt();
		
		System.out.println("��� : " + (i1+i2*i3) );
		
		String str1 = b.nextLine();

		String str2 = b.nextLine();

		String str3 = b.nextLine();
		
		System.out.println(str1 + "�� " + str2 + "�� ���, " +"����Ϲ�ȣ�� "+str3+"�Դϴ�.");
		
	}
	
}
