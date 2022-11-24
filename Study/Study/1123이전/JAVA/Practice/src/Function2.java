
public class Function2 {
	static void showResult(int a, int b) {
		System.out.println(a+"X"+b+"="+a*b);
	}
	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				showResult(i,j);
			}
		}
	}
}