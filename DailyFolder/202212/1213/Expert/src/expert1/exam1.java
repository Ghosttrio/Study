package expert1;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int m = s.nextInt();
		
		if(m>=3 && m<=5) {
			System.out.println("��");
		} else if(m>=6 && m<=8) {
			System.out.println("����");
		} else if(m>=9 && m<=11) {
			System.out.println("����");
		} else {
			System.out.println("�ܿ�");
		}
		
//		switch�� byte, char, short, int, String�� ��ȣ�� ����.
		
		switch(m) {
		case 1:
			System.out.println("�ܿ�");
			break;
		case 2:
			System.out.println("�ܿ�");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("��");
			break;
		case 5:
			System.out.println("��");
			break;
		case 6:
			System.out.println("����");
			break;
		case 7:
			System.out.println("����");
			break;
		case 8:
			System.out.println("����");
			break;
		case 9:
			System.out.println("����");
			break;
		case 10:
			System.out.println("����");
			break;
		case 11:
			System.out.println("����");
			break;
		case 12:
			System.out.println("�ܿ�");
			break;
		} 
		
		
		switch(m) {
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		}
	}

}
