package chap08.practice;

//public class DaumLogin extends Login {
public class DaumLogin implements Login {
	String id = "root";
	String pw = "54321";
	
	DaumLogin(){
		System.out.println("------���� �α��� ȭ��------");
	}
	
	@Override
	public void loginCheck(String id, String pw) {
		if(id.equals("root") && pw.equals("54321")) {
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
