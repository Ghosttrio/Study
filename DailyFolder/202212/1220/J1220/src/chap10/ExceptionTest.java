
package chap10;

public class ExceptionTest {

	public static void main(String[] args) {
		
//		Error는 JVM에서 처리 불가
//		System.out.println(a);
		
		int[] a = new int[2];
		System.out.println("예외 발생 이전");
		
		try {
			System.out.println("before");
			System.out.println(a[100]);
			System.out.println("after");
		} catch(Exception e) {
//			Exception은 모든 예외의 최상위 객체
			System.out.println("catch 실행");
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println(msg);
		} finally {
			System.out.println("finally 실행");
		}
		
//		1단계 메소드 작성시에 try catch
//		2단계 필요한 부분에만 try catch
//		3단계 발생할 수 있는 예외를 지정하기
		
//		조각조각 내는 것을 stream
//		조각의 크기를 buffer
		
//		throwsTest(200);
		System.out.println("예외 발생 이후");
		
	}
	
	static void throwsTest(int n) throws Exception{
		int[] a = new int[3];
		System.out.println(a[n]);
	}
	
	
}