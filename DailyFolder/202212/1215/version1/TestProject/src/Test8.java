// ���ڸ� �Է¹޴´�.
// ���ڰ� 50���� ũ��, n+" is greater than 50"
// ���ڰ� 50���ϸ�, n+" is less than 50"
// program terminated ���

import java.util.Scanner;

public class Test8 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		
		int n = s.nextInt();
		
		if(n>50) {
			System.out.println(n+ " is greater than 50");
		} else {
			System.out.println(n+ " is less than 50");
		}
			System.out.println("Program terminated");
		
	}

}
