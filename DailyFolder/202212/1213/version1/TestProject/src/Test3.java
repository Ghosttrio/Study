import java.util.Scanner;

//숫자 세개를 읽어서 abc
//a+b*c의 결과를 출력
public class Test3 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하시오 : ");
		int i1 = a.nextInt();

		System.out.print("두 번째 숫자를 입력하시오 : ");
		int i2 = a.nextInt();

		System.out.print("세 번째 숫자를 입력하시오 : ");
		int i3 = a.nextInt();
		
		System.out.println("결과 : " + (i1+i2*i3) );
		
		String str1 = b.nextLine();

		String str2 = b.nextLine();

		String str3 = b.nextLine();
		
		System.out.println(str1 + "는 " + str2 + "에 살고, " +"모바일번호는 "+str3+"입니다.");
		
	}
	
}
