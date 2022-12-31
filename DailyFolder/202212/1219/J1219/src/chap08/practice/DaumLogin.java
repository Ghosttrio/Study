package chap08.practice;

//public class DaumLogin extends Login {
public class DaumLogin implements Login {
	String id = "root";
	String pw = "54321";
	
	DaumLogin(){
		System.out.println("------다음 로그인 화면------");
	}
	
	@Override
	public void loginCheck(String id, String pw) {
		if(id.equals("root") && pw.equals("54321")) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("아이디나 비밀번호를 확인하세요.");
		}
	}
	@Override
	public void findId() {
		System.out.println("아이디를 찾습니다.");
		System.out.println("아이디는 \"" + this.id + "\"입니다.");
	}
	@Override
	public void findPw() {
		System.out.println("비밀번호를 찾습니다.");
		System.out.println("비밀번호는 \"" + this.pw + "\"입니다.");
	}
}
