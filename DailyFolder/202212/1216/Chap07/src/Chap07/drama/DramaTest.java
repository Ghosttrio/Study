package Chap07.drama;

public class DramaTest {

	public static void main(String[] args) {

//		드라마를 시청하는 메소드
//		전달인자 : Drama를 상속받은 클래스
//		기능 : 그 안에서 sick, revenge 등을 실행
		
		DramaA dramaA = new DramaA("용의 눈물");
		dramaA.checkSick("감기", 9);
		dramaA.checkBirth("홍길동", "홍길동");
		dramaA.checkRevenge(10);
		dramaA.checkTri(10);
		
		
		
//		DramaB dramaB = new DramaB("여명의 눈동자");
		
		
		
		
	}

}
