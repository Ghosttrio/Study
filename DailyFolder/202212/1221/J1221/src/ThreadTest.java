import java.util.ArrayList;

public class ThreadTest {
	
	static int a = 10;

	public static void main(String[] args) {

		System.out.println("출력 하나");
		
		Thread thread = new Thread(
		
				new Runnable() {

					@Override
					public void run() {
						
						try {
							Thread.sleep(1000);
							ThreadTest.a = 20;
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						
						System.out.println("run 실행" + ThreadTest.a);
					}
					
				}

		);
		thread.start();
		
		a = 5;
		System.out.println("출력 둘" + a);
		
		ArrayList<String> list = new ArrayList<String>();
//		list.add(1);
//		list.add(thread);
		list.add("string");
		
		String a = list.get(0);
//		get은 리턴타입이 object다
//		제네릭을 설정하면 리턴타입이 제네릭의 타입으로 바뀐다
		
		
	}

}
