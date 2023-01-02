
public class KumhoTire extends Tire {
	
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if(accmulatedRotation<maxRotation) {
			System.out.println(location + "KumhoTire ¼ö¸í : " + (maxRotation-accmulatedRotation) + "È¸");
			return true;
		} else {
			System.out.println("***" + location + " KumhoTire ÆãÅ© ***");
			return false;
		}
	}
}
