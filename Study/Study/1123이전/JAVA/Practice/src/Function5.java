

public class Function5 {
	
	static String drive(int n) {
		int speed = n;
		if(speed > 80) {
			return "overspeed";
		} else {
			return "lowspeed";
		}
	}
	
	public static void main(String[] args) {
		String x = drive(79);
		System.out.println(x);
	}
}
