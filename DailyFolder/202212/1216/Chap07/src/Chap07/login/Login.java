package Chap07.login;

public abstract class Login {

	String id;
	String password;
	
	Login(String id, String password) {
		System.out.println("Login ������");
		this.id = id;
		this.password = password;
	}
	
//	������� üũ���� ���� ������ ����
	abstract boolean loginCheck();
	
	private void loginOK() {
		System.out.println("�α��� ����");
	}
	
	private void loginFail() {
		System.out.println("�α��� ����");
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