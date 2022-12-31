package chap08.practice;

public class LoginTest {

	public static void main(String[] args) {
		NaverLogin login1 = new NaverLogin();
		login1.loginCheck("admin", "12345");
		login1.findId();
		login1.findPw();
		System.out.println("");
		
		DaumLogin login2 = new DaumLogin();
		login2.loginCheck("root", "54321");
		login2.findId();
		login2.findPw();
		
//		익명 구현 함수
		Login login = new Login() {
			
			@Override
			public void loginCheck(String id, String pw) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void findId() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void findPw() {
				// TODO Auto-generated method stub
				
			}
			
		};
	}

	static void a(Login b) {
		b.findId();
	}
}
