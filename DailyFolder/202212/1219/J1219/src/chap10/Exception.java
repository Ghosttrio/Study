package chap10;

public class Exception {

	public static void main(String[] args) {
		
//		Error는 JVM에서 처리 불가
//		System.out.println(a);
		
		int[] a = new int[2];
		System.out.println("예외 발생 이전");
		System.out.println(a[100]);
		System.out.println("예외 발생 이후");
		
		
	}
	
	
}
