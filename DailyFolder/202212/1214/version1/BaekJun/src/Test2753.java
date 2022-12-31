
//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

import java.util.Scanner;

public class Test2753 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
	
		
		
		int e = a.nextInt();
		
		boolean b = (e%4 == 0);
		boolean c = (e%100 != 0);
		boolean d = (e%400 == 0);
		
		if(b && c || d) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
