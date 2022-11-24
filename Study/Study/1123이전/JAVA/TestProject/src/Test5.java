import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오 : ");
		
		double i1 = a.nextDouble();
		double r2 = Math.sqrt(i1);
		
		System.out.println(i1+"의 제곱근은 "+r2+"입니다.");
		
	}
	
}
