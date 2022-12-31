package chap10;

public class LoginTest {

	public static void main(String[] args) /*throws Exception*/ {
		
		String pw1 = "1234";
		String pw2 = "12345";
		
//		throw new Exception();
		System.out.println("정상 실행 중...");
		
		
	
		boolean checkResult;
		try {
			checkResult = pwCheck(pw1, pw2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		if(checkResult) {
//			System.out.println("정상");
//		} else {
//			System.out.println("비정상");
//		}
		
	}
	
	static boolean pwCheck(String pw1, String pw2) throws Exception {
		if(pw1.equals(pw2)) {
			System.out.println("정상");
			throw new HumanException("1");
		} else {
			System.out.println("둘이 서로 다릅니다");
			throw new HumanException("-1");
//			return false;
		}
	}
}
