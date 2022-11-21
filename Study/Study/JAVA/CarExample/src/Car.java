
public class Car {

	Tire frontLeft, frontRight, rearLeft, rearRight;
	
	Car(){
		this.frontLeft = new Tire("Front Left", 6);
		this.frontRight = new Tire("Front Right", 2);
		this.rearLeft = new Tire("Rear Left", 3);
		this.rearRight = new Tire("Rear Right", 4);
	}
	
	int run() {
		System.out.println("[Car is driving]");
		if(frontLeft.roll()==false) { this.stop(); return 1;}
		if(frontRight.roll()==false) { this.stop(); return 2;}
		if(rearLeft.roll()==false) { this.stop(); return 3;}
		if(rearRight.roll()==false) { this.stop(); return 4;}
		return 0;
	}
	private void stop() {
		System.out.println("Car stops");
	}
}
