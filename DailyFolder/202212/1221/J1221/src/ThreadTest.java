import java.util.ArrayList;

public class ThreadTest {
	
	static int a = 10;

	public static void main(String[] args) {

		System.out.println("��� �ϳ�");
		
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
						
						System.out.println("run ����" + ThreadTest.a);
					}
					
				}

		);
		thread.start();
		
		a = 5;
		System.out.println("��� ��" + a);
		
		ArrayList<String> list = new ArrayList<String>();
//		list.add(1);
//		list.add(thread);
		list.add("string");
		
		String a = list.get(0);
//		get�� ����Ÿ���� object��
//		���׸��� �����ϸ� ����Ÿ���� ���׸��� Ÿ������ �ٲ��
		
		
	}

}
