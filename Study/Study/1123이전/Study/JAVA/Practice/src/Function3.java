
public class Function3 {
	static String showResult(int a, int b) {
		return (a+"X"+b+"="+a*b);
	}
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				String x = showResult(i,j); // 매개변수/parameter
				System.out.println(x);
			}
		}
	}
}