import java.util.Scanner;

public class Test14 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int i=2;
		long y=1;
		
		while(i<n) {
			y*=n%i;	
			i++;
			if(i==n) {
				if(y==0) {
					System.out.println("�Ҽ��� �ƴմϴ�.");
				} else {
					System.out.println("�Ҽ��Դϴ�.");
				}
			}
		} 
		if(n==2) {
			System.out.println("�Ҽ��Դϴ�.");
		}

	}
}
/*
 * �Ҽ�(Prime Number) 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
 * 1 or n
 * 		% 
			/
			1 , n
			2~x-1 �ѹ��̶� 0���� �������� �Ҽ��� �ƴϴ�
 */