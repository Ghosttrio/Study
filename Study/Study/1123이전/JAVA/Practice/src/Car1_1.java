
public class Car1_1 {
	public static void main(String[] args) {
		
		Car myCar = new Car(); // (Ŭ����) �ν��Ͻ� ����
		//	Ÿ�� ������  = ��;
		
		System.out.println(myCar.getColor());
		System.out.println(myCar.getMaxSpeed());
		System.out.println(myCar.getMaker());
		System.out.println("");

		Car yourCar = new Car("KIA");
		System.out.println(yourCar.getColor());
		System.out.println(yourCar.getMaxSpeed());
		System.out.println(yourCar.getMaker());
		System.out.println("");
		
		Car herCar = new Car("yellow", 320, 30, "Cayen", "Porsche", 220);
		System.out.println(herCar.getColor());
		System.out.println(herCar.getMaxSpeed());
		System.out.println(herCar.getSpeed());
		System.out.println(herCar.getModel());
		System.out.println(herCar.getMaker());
		System.out.println(herCar.getYear());
//		
////		myCar.color = "red";  // �ν��Ͻ���.������ = ��/����/ǥ����;
////		yourCar.color = "blue";
//		
//		myCar.setColor("red"); 
//		// ĸ��ȭ �Ǿ��ֱ⿡ yourCar�� color�� �ƴ϶� myCar�� color��.
//		yourCar.setColor("blue");
//	
//		
////	System.out.println(myCar.getColor());
////	System.out.println(yourCar.getColor());
//		//�ظ��ϸ� �޼ҵ带 ���ؼ� ���� ȣ��
//		
//		myCar.setMaxSpeed(300);
//		yourCar.setMaxSpeed(240);
//		//�޼ҵ� ���� x
//		myCar.setSpeed(0);
//		yourCar.setSpeed(0);
//		// myCar.speed = yourCar.speed = 0;
//		// int x, y, z;
//		// x=y=z= 10;
//		myCar.setModel("Seltos");
//		yourCar.setModel("Tesla");
//		
//		myCar.setMaker("KIA");
//		yourCar.setMaker("Model S");
//		
//		myCar.setYear(2021);
//		yourCar.setYear(2020);
//		
//		System.out.println(myCar.getMaker());
//		System.out.println(yourCar.getMaker());
//		
//		myCar.drive(60);
//		yourCar.drive(80);
//		myCar.turnLeft();
//		myCar.stop();
//		
	}
}
