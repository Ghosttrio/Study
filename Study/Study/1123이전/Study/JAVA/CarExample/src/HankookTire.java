
public class HankookTire extends Tire {

	public HankookTire(String loc, int max) {
		super(loc, max);
		
	}
	
	@Override
	public boolean roll() {
		++this.accumulatedRotation;
		if(this.accumulatedRotation<maxRotation) {
			System.out.println("Hankook Tire's left Rotate:"+ (this.maxRotation-this.accumulatedRotation) + " rounds");
			return true;
		} else {
			System.out.println(this.location + "Hankook Tire punk");
			return false;
		}
	}
}
