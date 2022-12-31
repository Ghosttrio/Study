package Chap07.login;

public class LoginTest {

	public static void main(String[] args) {
		
		String id = "admin";
		String pw = "12345";
		
		LoginNaver naver = new LoginNaver(id, pw);
		
		naver.doLogin();
		
		System.out.println("------------------------");
		
		LoginKakao kakao = new LoginKakao(id, pw);
		
		kakao.doLogin();
	}

}
