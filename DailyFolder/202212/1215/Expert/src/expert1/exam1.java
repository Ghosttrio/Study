package expert1;

import java.util.Scanner;

public class exam1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int m = s.nextInt();
		
		if(m>=3 && m<=5) {
			System.out.println("봄");
		} else if(m>=6 && m<=8) {
			System.out.println("여름");
		} else if(m>=9 && m<=11) {
			System.out.println("가을");
		} else {
			System.out.println("겨울");
		}
		
//		switch는 byte, char, short, int, String이 괄호에 들어간다.
		
		switch(m) {
		case 1:
			System.out.println("겨울");
			break;
		case 2:
			System.out.println("겨울");
			break;
		case 3:
			System.out.println("봄");
			break;
		case 4:
			System.out.println("봄");
			break;
		case 5:
			System.out.println("봄");
			break;
		case 6:
			System.out.println("여름");
			break;
		case 7:
			System.out.println("여름");
			break;
		case 8:
			System.out.println("여름");
			break;
		case 9:
			System.out.println("가을");
			break;
		case 10:
			System.out.println("가을");
			break;
		case 11:
			System.out.println("가을");
			break;
		case 12:
			System.out.println("겨울");
			break;
		} 
		
		
		switch(m) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		}
	}

}
