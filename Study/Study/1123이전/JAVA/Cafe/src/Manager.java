
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		
		Menu menu = new Menu();
		menu.display();
		
		System.out.print("�۾��� �����Ͻÿ� (m:�޴�����, o:�ֹ�����, s:�������, x:����) : ");
		String str = s.nextLine();		
		while(true) {
		if(str.equals("m")) {
				System.out.print("//�۾��� �����Ͻÿ� (c:�߰�, r:���, u:����, d:����, x:����) : ");
				String str1 = s.nextLine();

				// ����ġ���� ��밡��
//				switch(str1) {
//				case : "c":
//					menu.build() ; break;
//				case : "r":
//					~~~~~~
//				}
				
				while(true) {
					if(str1.equals("c")) {
						menu.build();
					} else if(str1.equals("r")) {
						menu.display();
					} else if(str1.equals("u")) {
						menu.update();
					} else if(str1.equals("d")) {
						menu.delete();
					} else if(str1.equals("x")) {
						menu.save();
						break;
					}
					System.out.println("//�۾��� �����Ͻÿ� (c:�߰�, r:���, u:����, d:����, x:����)");
					str1 = s.nextLine();
				}
				
			} else if(str.equals("o")) {
				
				Order order = new Order(menu); // ��ȣ�ȿ�  menu
				
				System.out.print("//�۾��� �����Ͻÿ� (c:�߰�, r:���, x:����) : ");
				String str1 = s.nextLine();
					while(true) {
						if(str1.equals("c")) {
							order.add();
						} else if(str1.equals("r")) {
							order.display();
						} else if(str1.equals("x")) {
							order.reset();
							break;
						}
						
					System.out.print("//�۾��� �����Ͻÿ� (c:�߰�, r:���, x:����) : ");
					str1 = s.nextLine();
					}
			} else if(str.equals("s")) {

			} else if(str.equals("x")) {
				break;
			}
			System.out.println("�۾��� �����Ͻÿ� (m:�޴�����, o:�ֹ�����, s:�������, x:����)");
			str=s.nextLine();
		}
		System.out.println("���α׷� ����");
		s.close();
	}
	
}