
public class Car { // 거푸집
	
	// 속성 -> 변수(필드)	(c++:멤버변수)
	private String color;
	private int maxSpeed;
	private int speed;
	private String model;
	private String maker;
	private int year;
	
	Car(){
		this.color = "white";
		this.maxSpeed = 240;
		this.maker="Hyundai";
	}
	Car(int mSpeed){
		this.color = "white";
		this.maxSpeed = mSpeed;
	}
	Car(String makerName){
		this.color = "white";
		this.maxSpeed = 240;
		this.maker=makerName;
	}
	Car(int mSpeed, String makerName){
//		this(mSpeed);
//		this(makerName); 안됨
		this();
		this.maxSpeed = mSpeed;
		
	}
	
	Car(String strColor, int maxSpeed, int speed, String model, String maker, int year){
		this();
		this.speed = speed;
		this.model = model;
		
		this.year = year;
	}
	
	
	public String getColor() {					// face
		return color;							// body
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed; // setter
	}
	
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	// 기능 -> 함수(메소드)	(c++:멤버함수)
	void stop(){
//		this.speed = 0;
		this.setSpeed(0); // 함수가함수를호출
							// 중복코드를 방지
		System.out.println(this.model + " 정지합니다.");
	}
	void drive(int n){
		speed = n;
		System.out.println(this.model+" 현재속도 "+speed+"km/h");
	}
	
	int drive() {
		return this.speed;
	}
	//main에서 myCar.drive(10)
	//int a = myCar.drive();
	
	
	
	void turnLeft() {
		System.out.println(this.model+" 좌회전");
	}
	void turnright() {
		System.out.println(this.model+" 우회전");
	}
	
}