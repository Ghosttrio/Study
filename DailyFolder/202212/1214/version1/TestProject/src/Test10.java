import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("m:�޴�����, o:�ֹ�����, s:�������, x:����");
		
		String name = t.nextLine();
							
		if(name.equals("m")) {
			
			System.out.println("�޴�����");
			
		} else if(name.equals("o")) {
			
			System.out.println("�ֹ�����");
			
		} else if(name.equals("s")) {
			
			System.out.println("�������");
			
		} else if(name.equals("x")) {
			
			System.out.println("�������");
			
		} else {
			
			System.out.println("�ٽ��Է��Ͻÿ�");
			
		}
			

	}

}
