package chap10;

public class StringTest {

	public static void main(String[] args) {

		String str = "영일이삼사오";
		char a = str.charAt(3);
		System.out.println(a);
		
		int b = str.indexOf("삼");
		System.out.println(b);
		b = str.indexOf("삼사");
		System.out.println(b);
		b = str.indexOf("냥냥");
		System.out.println(b);
		
		String url1 = "blog.naver41541.com";
		String url2 = "cafe.naver.com";
	
		if(url1.indexOf("cafe") == -1) {
			System.out.println("url은 cage가 아닙니다.");
		}
		if(url1.indexOf("cafe") >= 0) {
			System.out.println("url은 blog 입니다.");
		}
	
		int idx = url1.indexOf(".");
		System.out.println(idx);
//		indexOf는 전달인자인 문자열과 가장 처음 만나는 위치를 돌려준다 (원하는 것을 찾으면 break)
		
		System.out.println(url1.substring(5));
		System.out.println(url1.substring(5,7));
		
//		url1에서 첫 번째 점과 두 번째 점 사이의 값만 출력
//		단 "."과 indexOf, substring 이용해서
		
		int d = url1.indexOf(".")+1;
		int e = url1.substring(d).indexOf(".");
		System.out.println(url1.substring(d,e));

		String y1 = "Yes";
		if( y1.toLowerCase().equals("YeS".toLowerCase()) ) {
			System.out.println("긍정");
		}
//	자료 검색할때
		
		String y2 = "    y  e   s         ";
		System.out.println(y2.trim());
		
//		로그인에 트림
		
		String searchKeyword = "   ";
		if(searchKeyword.trim().length() == 0) {
			System.out.println("빈문자열입니다. 입력해주세요");
		}
		
		int count = countOf(url1, ".");
		System.out.println(count);
		
	}
	
//	str에 keyword가 몇개있는지 확인
	
	static int countOf(String str, String keyword) {
		int result = 0;
		for(int i=0; i<str.length(); i++) {
			String a = String.valueOf(str.charAt(i));
//			String a = str.charAt(i)+"";
			if(a.equals(keyword)) {
				result++;
			}
		}
		
//		byte[] items = str.getBytes();
//		for(int i=0; i<items.length; i++) {
//			
//		}
		
		
		return result;
	}
	

}
