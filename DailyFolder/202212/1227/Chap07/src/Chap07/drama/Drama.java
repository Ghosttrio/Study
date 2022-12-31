package Chap07.drama;

public abstract class Drama {

	String title;
	String type; 
	int days;
	
	
	Drama(){
		this.title = "";
	}

	void setTitle(String title){
		this.title = title;
	}
	
	String getTitle(){
		return this.title;
	}
	
	
//	--------------------------------------------------------
//	아픔
//	전달인자 : 병명, 기간
//	리턴타임 : 기분
	abstract String sick(String type, int days);

	void checkSick(String type, int days) {	
//		if(sick(type, days).equals("감기") && days < 10) {
//			System.out.println("그냥 감기입니다.");
//		} else {
//			System.out.println("죽을 병입니다.");
//		}
		System.out.println(sick(type, days));
	}
	
//	--------------------------------------------------------

//	출생의 비밀
//	전달인자 : 원래부모, 지금부모
//	리턴타입 : 비밀 여부
	abstract boolean birthInfo(String origin, String now);
	
	void checkBirth(String origin, String now) {
		if(birthInfo(origin, now)) {
			System.out.println("내가 니 애비다");
		} else {
			System.out.println("누구세요?");
		}
	}
	
//	--------------------------------------------------------
//	복수
//	전달인자 : 복수심의 정도
//	리턴타입 : 복수방법
	abstract String revenge(int angry);
	
	void checkRevenge(int angry) {
		System.out.println(revenge(angry));
	}

//	--------------------------------------------------------
//	삼각관계
//	전달인자 : 인원 수
//	리턴타입 : 결과
	abstract String triangle(int count);
	
	void checkTri(int count) {
		System.out.println(triangle(count));
	}
//	--------------------------------------------------------
}
