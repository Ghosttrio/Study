
public class DmbPhone extends CellPhone {
	
	int price;
	int year;
	
	public DmbPhone() {
	}

	public DmbPhone(int price, int year) {
		super();
		this.price = price;
		this.year = year;
	}

	@Override
	void powerOn() {
		super.powerOn();
		System.out.println("DMB Power On");
	}
}
