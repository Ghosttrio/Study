import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		String x = "종료";
		String m = "메뉴관리";
		String o = "주문관리";
		String s = "매출관리";
		
		while(true) {
			String a = p.nextLine();
			
			if(a.equals("m")) {
				System.out.println(m);
			} else if(a.equals("o")) {
				System.out.println(o);
			} else if(a.equals("s")) {
				System.out.println(s);
			} else if(a.equals("x")) {
				System.out.println(x);
				break;
			}
			
		}	System.out.println("프로그램 종료");
	
	}

}