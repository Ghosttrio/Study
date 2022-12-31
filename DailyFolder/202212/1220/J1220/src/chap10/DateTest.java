package chap10;

public class DateTest {

	public static void main(String[] args) {
		
//		long ms = System.currentTimeMillis();
//		System.out.println(ms);
//		
//		long before = System.currentTimeMillis();
//		for(int i=0; i<10000; i++) {
//			System.out.println(i);
//		}
//		long after = System.currentTimeMillis();
//		System.out.println("걸린시간 : " + (after - before));
//		
//		
//		long before1 = System.currentTimeMillis();
//		int i = 0;
//		while(i<10000) {
//			System.out.println(i);
//			i++;
//		}
//		long after1 = System.currentTimeMillis();
//		System.out.println("걸린시간 : " + (after1 - before1));
		
		String a = System.getProperty("file.separator");
		System.out.println(a);
		
//		Test t = new Test();
		try {
			Class clazz = Class.forName("Test");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
