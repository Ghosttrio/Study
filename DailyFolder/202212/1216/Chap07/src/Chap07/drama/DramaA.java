package Chap07.drama;

public class DramaA extends Drama {

	DramaA(String title){
		this.title = title;
		System.out.println(getTitle() + " 시작");
	}
//	--------------------------------------------------------
	
	@Override
	String sick(String type, int days) {
		if(type.equals(type) && days < 10) {
//			return type;
			return "그냥 감기입니다.";
		} else {
//			return type;
			return "죽을 병입니다.";
		}
	}

//	--------------------------------------------------------

//	@Override
	boolean birthInfo(String origin, String now) {
		if(origin.equals(now)) {
			return true;
		} else {
			return false;
		}
	}
	
//	--------------------------------------------------------
	
//	@Override
	String revenge(int angry) {
		if(angry > 80) {
			String a = "김치싸대기";
			return a;
		} else {
			String b = "딱밤";
			return b;
		
		}
	}

//	--------------------------------------------------------
	
//	@Override
	String triangle(int count) {
		
		if(count == 3) {
			return "삼각관계";
		} else {
			return "다각관계";
		}
		
	}
	
}
