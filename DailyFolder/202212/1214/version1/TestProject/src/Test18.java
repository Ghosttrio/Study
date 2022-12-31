public class Test18 {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c = a + b;
		
		for(int i=c; c<1000; i=c) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}