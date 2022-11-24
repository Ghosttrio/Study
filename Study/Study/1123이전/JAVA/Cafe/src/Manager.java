
import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Scanner s3 = new Scanner(System.in);
		
		Menu menu = new Menu();
		menu.display();
		
		System.out.print("작업을 선택하시오 (m:메뉴관리, o:주문관리, s:매출관리, x:종료) : ");
		String str = s.nextLine();		
		while(true) {
		if(str.equals("m")) {
				System.out.print("//작업을 선택하시오 (c:추가, r:출력, u:수정, d:삭제, x:종료) : ");
				String str1 = s.nextLine();

				// 스위치문도 사용가능
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
					System.out.println("//작업을 선택하시오 (c:추가, r:출력, u:수정, d:삭제, x:종료)");
					str1 = s.nextLine();
				}
				
			} else if(str.equals("o")) {
				
				Order order = new Order(menu); // 괄호안에  menu
				
				System.out.print("//작업을 선택하시오 (c:추가, r:출력, x:종료) : ");
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
						
					System.out.print("//작업을 선택하시오 (c:추가, r:출력, x:종료) : ");
					str1 = s.nextLine();
					}
			} else if(str.equals("s")) {

			} else if(str.equals("x")) {
				break;
			}
			System.out.println("작업을 선택하시오 (m:메뉴관리, o:주문관리, s:매출관리, x:종료)");
			str=s.nextLine();
		}
		System.out.println("프로그램 종료");
		s.close();
	}
	
}