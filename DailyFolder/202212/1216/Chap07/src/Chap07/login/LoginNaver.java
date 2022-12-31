package Chap07.login;

public class LoginNaver extends Login {

	String userId = "root";
	String userPw = "1234";
	
	LoginNaver(String id, String password) {
		super(id, password);
		System.out.println("네이버 입니다");
	}

	@Override
	boolean loginCheck() {
		
		if(this.id.equals(userId) && this.password.equals(userPw)) {
			return true;
		} else {
			return false;
		}
		
//		boolean result = false;
//		if(this.id.equals(userId) && this.password.equals(userPw)) {
//			result = true;
//		} 
//		return result;
		
	}
	
}
