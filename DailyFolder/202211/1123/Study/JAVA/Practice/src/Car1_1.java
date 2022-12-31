
public class Car1_1 {
	public static void main(String[] args) {
		
		Car myCar = new Car(); // (클래스) 인스턴스 변수
		//	타입 변수명  = 값;
		
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
////		myCar.color = "red";  // 인스턴스명.변수명 = 값/변수/표현식;
////		yourCar.color = "blue";
//		
//		myCar.setColor("red"); 
//		// 캡슐화 되어있기에 yourCar의 color가 아니라 myCar의 color다.
//		yourCar.setColor("blue");
//	
//		
////	System.out.println(myCar.getColor());
////	System.out.println(yourCar.getColor());
//		//왠만하면 메소드를 통해서 값을 호출
//		
//		myCar.setMaxSpeed(300);
//		yourCar.setMaxSpeed(240);
//		//메소드 이퀄 x
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
