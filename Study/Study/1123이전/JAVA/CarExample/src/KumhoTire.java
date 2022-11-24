
public class KumhoTire extends Tire {

	public KumhoTire(String loc, int max) {
		super(loc, max);
	}
	@Override
	public boolean roll() {
		++this.accumulatedRotation;
		if(this.accumulatedRotation<maxRotation) {
			System.out.println("Kumho Tire's left Rotate:"+ (this.maxRotation-this.accumulatedRotation) + " rounds");
			return true;
		} else {
			System.out.println(this.location + "Kumho Tire punk");
			return false;
		}
	}
}
