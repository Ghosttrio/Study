
public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			switch(problemLocation) {
			case 1:
				System.out.println("Front Left Tire to HankookTire");
				car.frontLeft = new HankookTire("FrontLeft", 15);
				break;
			case 2:
				System.out.println("Front Right Tire to KumhoTire");
				car.frontRight = new KumhoTire("FrontRight", 13);
				break;
			case 3:
				System.out.println("Rear Left Tire to HankookTire");
				car.rearLeft = new HankookTire("RearLeft", 14);
				break;
			case 4:
				System.out.println("Rear Left Tire to KumhoTire");
				car.rearLeft = new KumhoTire("RearLeft", 17);
				break;
			}
		System.out.println("----------------------");
		}
	}
}
