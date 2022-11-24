import java.util.Scanner;

public class Test17 {
	
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하시오. : ");
		String B = a.nextLine();
		int D = Integer.parseInt(B);
		System.out.print("두 번째 숫자를 입력하시오. : ");
		String C = a.nextLine();
		int E = Integer.parseInt(C);
		System.out.println("합계 : " + (D + E));
		System.out.println("프로그램을 종료합니다.");

	}
}