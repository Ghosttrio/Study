package chap08.practice;

//public class NaverLogin extends Login {
public class NaverLogin implements Login {
	
	String id = "admin";
	String pw = "12345";
	
	NaverLogin(){
		System.out.println("------���̹� �α��� ȭ��------");
	}
	
	@Override
	public void loginCheck(String id, String pw) {
		if(id.equals("admin") && pw.equals("12345")) {
			System.out.println("�α��� �Ǿ����ϴ�.");
		} else {
			System.out.println("���̵� ��й�ȣ�� Ȯ���ϼ���.");
		}
	}
	@Override
	public void findId() {
		System.out.println("���̵� ã���ϴ�.");
		System.out.println("���̵�� \"" + this.id + "\"�Դϴ�.");
	}
	@Override
	public void findPw() {
		System.out.println("��й�ȣ�� ã���ϴ�.");
		System.out.println("��й�ȣ�� \"" + this.pw + "\"�Դϴ�.");
	}
	
}
