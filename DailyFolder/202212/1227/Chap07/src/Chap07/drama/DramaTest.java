package Chap07.drama;

public class DramaTest {

	public static void main(String[] args) {

//		int a = 10;
//		int b = 20;
//		b = a;
//		Drama1 drama1 = new Drama1();
//		Drama1 drama1_1 = new Drama1();
//		Drama drama = drama1;
//		
//		drama1 = drama1_1;
		
//		if ( drama instanceof Drama1) {
//			drama1_1 = (Drama1)drama;
//		}
		
		
		
//		드라마를 시청하는 메소드
//		전달인자 : Drama를 상속받은 클래스
//		기능 : 그 안에서 sick, revenge 등을 실행
		
		DramaA dramaA = new DramaA("용의 눈물");
		dramaA.checkSick("감기", 9);
		dramaA.checkBirth("홍길동", "홍길동");
		dramaA.checkRevenge(10);
		dramaA.checkTri(10);
	
	}
	static void watchDrama(Drama drama) {
		String t = drama.getTitle();
		System.out.println(t);
		drama.revenge(2);
	}

}
