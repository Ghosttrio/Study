package chap10;

public class LoginTest {

	public static void main(String[] args) /*throws Exception*/ {
		
		String pw1 = "1234";
		String pw2 = "12345";
		
//		throw new Exception();
		System.out.println("���� ���� ��...");
		
		
	
		boolean checkResult;
		try {
			checkResult = pwCheck(pw1, pw2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		if(checkResult) {
//			System.out.println("����");
//		} else {
//			System.out.println("������");
//		}
		
	}
	
	static boolean pwCheck(String pw1, String pw2) throws Exception {
		if(pw1.equals(pw2)) {
			System.out.println("����");
			throw new HumanException("1");
		} else {
			System.out.println("���� ���� �ٸ��ϴ�");
			throw new HumanException("-1");
//			return false;
		}
	}
}
