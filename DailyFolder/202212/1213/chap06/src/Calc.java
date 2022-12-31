
public class Calc {

	String nickname = "fff";
	String brand;
	int age;

//	기본생성자 : 안써도 자바가 알아서 만들어준다.
	Calc(){
//		생성자는 다른 생성자를 호출하는 경우
//		제일 첫 줄에 적어야 한다.
		this("baba");
//		다른 생성자 실행 후 실행됨
		System.out.println("Calc 생성자");
	}
	
	Calc(String nickname){
		System.out.println("Calc 생성자: "+nickname);
		this.nickname=nickname;
	}
	
	
	
	void setDiviceInfo(String n) {
		nickname = n;
//		brand = "sony";
//		age = 10;
		setDiviceInfo(n, "sony", 10);
		
	}
	
	
	void setDiviceInfo(String n, String b, int a) {
		nickname = n;
		brand = b;
		age = a;
	}

	
	
//	기능 : 전달받은 문자로 nickname 변경
//	전달인자 : String
//	리턴타임 : 없음
	
	void setNickname(String nickname) {
		this.nickname = nickname;
		return;
	}
	void getNickname() {
		System.out.println(this.nickname);
		return;
	}
	
	
	
/*
 * @author : 박창순
 * @param : int x, int y : 더할 두 숫자
 */
	
	
	
//	기능 : 두가지 숫자(int)를 받아서 
//	더해서 돌려줌
//	메소드명 : sum
//	전달인자 : int, int
//	리턴타입 : int
	
	int x;
	int y;
	String a;
		
	int sum(int x, int y) {
		int result = x + y;
		return result;
	}
	
	String underBar(String a) {
		String b = "";
		for(int i=0; i<20; i++) {
			b+=a;
		}
		return b;
	}
	
//	----------------------------
	
	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	int multi(int x, int y) {
		int result = x * y;
		return result;
	}
	double divide(int x, int y) {
		int result = x / y;
		return result;
	}
	int remain(int x, int y) {
		int result = x % y;
		return result;
	}
	
	
//	기능 : 시험삼아 두 값을 받아서 더하기 하고 그 결과를
//		제곱
	
	int square(int x, int y) {
		int sum = x + y;
		return sum*sum;
	}
	
	
//	기능 : 필드값 nickname을 출력
//	전달인자 : 없다
//	리턴타임 : 없다
	void printNickname() {
		System.out.println(this.nickname);
		return;
	}
	
	
	
	
	
	
	
	
}
