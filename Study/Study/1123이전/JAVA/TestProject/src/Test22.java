import java.util.Scanner;

public class Test22 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("X�� ���� �Է��Ͻÿ�:");
		int x = s.nextInt();
		System.out.print("Y�� ���� �Է��Ͻÿ�:");
		int y = s.nextInt();
	
		if(x>y) {
			int a=1;
			for(int i=2; i<=y; i++) {
				if(x%i==0 && y%i==0) {
					x=x/i; y=y/i; a*=i; i--;
				}	
			} 
			System.out.println("�ּҰ����:"+a*x*y);
			System.out.println("�ִ�����:"+a);
		} else {
			int a=1;
			for(int i=2; i<=x; i++) {
				if(x%i==0 && y%i==0) {
					x=x/i; y=y/i; a*=i; i--;
				}
			} 
			System.out.println("�ּҰ����:"+a*x*y);
			System.out.println("�ִ�����:"+a);
		}
		
		
	}

}
