
public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + "HankookTire ¼ö¸í : " + (maxRotation-accmulatedRotation) + "È¸");
			return true;
		} else {
			System.out.println("***" + location + " HankookTire ÆãÅ© ***");
			return false;
		}
	}
}
