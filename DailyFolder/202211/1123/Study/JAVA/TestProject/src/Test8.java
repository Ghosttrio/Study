// 숫자를 입력받는다.
// 숫자가 50보다 크면, n+" is greater than 50"
// 숫자가 50이하면, n+" is less than 50"
// program terminated 출력

import java.util.Scanner;

public class Test8 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		
		int n = s.nextInt();
		
		if(n>50) {
			System.out.println(n+ " is greater than 50");
		} else {
			System.out.println(n+ " is less than 50");
		}
			System.out.println("Program terminated");
		
	}

}
