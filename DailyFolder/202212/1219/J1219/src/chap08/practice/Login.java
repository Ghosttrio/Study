package chap08.practice;

//public abstract class Login {
public interface Login {
	
	public abstract void loginCheck(String id, String pw);
	
	public abstract void findId();
	
	public abstract void findPw();
}
