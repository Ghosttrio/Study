
public class PhoneMain {

	public static void main(String[] args) {
		
		System.out.println("NOKIA-------------------");
		System.out.println("");
		CellPhone nokia = new CellPhone();
		
		nokia.powerOn();
		nokia.bell();
		nokia.hangUp();
		nokia.powerOff();
		nokia.model = "aa";
		nokia.color = "blue";
//		nokia.price = 500000; 안됨
//		nokia.year = 2020; 안됨
		System.out.println(nokia.model);
		System.out.println(nokia.color);
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("BLACKBERRY--------------");
		System.out.println("");
		DmbPhone blackberry = new DmbPhone();
		
		blackberry.powerOn();
		blackberry.bell();
		blackberry.hangUp();
		blackberry.powerOff();
		blackberry.model = "NK4320";
		blackberry.color = "red";
		blackberry.price = 500000;
		blackberry.year = 2020;
		
		
		System.out.println(blackberry.model);
		System.out.println(blackberry.color);
		System.out.println(blackberry.price);
		System.out.println(blackberry.year);
		
	}

}
