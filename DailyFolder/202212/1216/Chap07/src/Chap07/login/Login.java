package Chap07.login;

public abstract class Login {

	String id;
	String password;
	
	Login(String id, String password) {
		System.out.println("Login 생성자");
		this.id = id;
		this.password = password;
	}
	
//	어떤식으로 체크할지 아직 정하지 않음
	abstract boolean loginCheck();
	
	private void loginOK() {
		System.out.println("로그인 성공");
	}
	
	private void loginFail() {
		System.out.println("로그인 실패");
	}
	
	void doLogin() {
		boolean isLoginOK = loginCheck();
		if(isLoginOK) {
			loginOK();
		} else {
			loginFail();
		}
	}
}