import java.util.Scanner;

//이름, 도시명, 모바일번호 입력받고 출력

public class Test4 {

	public static void main(String[] args) {
		
		Scanner b = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오 : ");
		String str1 = b.nextLine();
		System.out.print("도시명을 입력하시오 : ");
		String str2 = b.nextLine();
		System.out.print("모바일번호를 입력하시오 : ");
		String str3 = b.nextLine();
		
		System.out.println(str1 + "은 " + str2 + "에 살고, " + "모바일번호는 " + str3 + "입니다.");
		
	}
	
}