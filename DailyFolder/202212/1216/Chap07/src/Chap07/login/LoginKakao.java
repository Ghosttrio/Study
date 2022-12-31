package Chap07.login;

public class LoginKakao extends Login {

	String id = "admin";
	String pw = "12345";
	
	LoginKakao(String id, String pw){
		super(id, pw);
		System.out.println("카카오입니다.");
	}
	
	@Override
	boolean loginCheck() {
		boolean result = false;
		
		if(this.id.equals(id) && this.password.equals(pw)) {
			result = true;
		} 
		return result;
	}
	
}
