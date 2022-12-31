package expert1;
import java.util.Scanner;

public class exam3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("10~99 사이의 숫자를 입력 : ");
		int n = s.nextInt();
		int n_10 = n / 10; //int의 성질을 이용
		int n_1 = n % 10;
		if(n_10 == n_1) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
//		if(n % 11 == 0) {
//			System.out.println("같다");
//		} else {
//			System.out.println("다르다");
//		}
//		
		
		
		
		
	}

}
