package chap08;

public interface FirstInterface {

//	new 할 수 없다.
	
//	인터페이스의 모든 필드는 public static final이 생략 됨
//	대문자
	public static final int A = 10;
	int B = 20;
	public static final int LOGIN_STATUS = -1;
//	선언과 동시에 초기화 해야 한다.
	
	
//	public abstract가 생략되어 있는 형태
	void test();
	void test(int a);
//	overloading도 가능
	
	public abstract void methodTest(); 

	
	public default void test1() {
		System.out.println("실행블럭이 있는 메소드");
		System.out.println("니네가 구현해서 쓰세요");
	}
	
	
}
