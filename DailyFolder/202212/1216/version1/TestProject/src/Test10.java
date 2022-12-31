import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("m:메뉴관리, o:주문관리, s:매출관리, x:종료");
		
		String name = t.nextLine();
							
		if(name.equals("m")) {
			
			System.out.println("메뉴관리");
			
		} else if(name.equals("o")) {
			
			System.out.println("주문관리");
			
		} else if(name.equals("s")) {
			
			System.out.println("매출관리");
			
		} else if(name.equals("x")) {
			
			System.out.println("매출관리");
			
		} else {
			
			System.out.println("다시입력하시오");
			
		}
			

	}

}
