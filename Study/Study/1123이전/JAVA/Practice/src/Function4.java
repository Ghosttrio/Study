
public class Function4 {
	static void drive(int n) {
		int speed = n;
		if(speed > 80) {
			return;
		}
		System.out.println(speed);
	}
	
	public static void main(String[] main) {
		drive(78);
	}
}
