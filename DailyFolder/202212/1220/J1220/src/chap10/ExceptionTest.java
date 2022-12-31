
package chap10;

public class ExceptionTest {

	public static void main(String[] args) {
		
//		Error�� JVM���� ó�� �Ұ�
//		System.out.println(a);
		
		int[] a = new int[2];
		System.out.println("���� �߻� ����");
		
		try {
			System.out.println("before");
			System.out.println(a[100]);
			System.out.println("after");
		} catch(Exception e) {
//			Exception�� ��� ������ �ֻ��� ��ü
			System.out.println("catch ����");
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println(msg);
		} finally {
			System.out.println("finally ����");
		}
		
//		1�ܰ� �޼ҵ� �ۼ��ÿ� try catch
//		2�ܰ� �ʿ��� �κп��� try catch
//		3�ܰ� �߻��� �� �ִ� ���ܸ� �����ϱ�
		
//		�������� ���� ���� stream
//		������ ũ�⸦ buffer
		
//		throwsTest(200);
		System.out.println("���� �߻� ����");
		
	}
	
	static void throwsTest(int n) throws Exception{
		int[] a = new int[3];
		System.out.println(a[n]);
	}
	
	
}