
public class Car {   // 거푸집
	// 속성 -> 변수(필드)    멤버변수[C++] Member variable
	private String color;
	private int maxSpeed;
	private int speed;
	private String model;
	private String maker;
	private int year;
	
	Car(){
		this.color="white";
		this.maxSpeed=240;
		this.speed=0;
		this.model="";
		this.maker="Hyungdai";
		this.year=1990;
	}
	Car(int mSpeed){
		this.color="white";
		this.maxSpeed=mSpeed;
		this.speed=0;
		this.model="";
		this.maker="Hyungdai";
		this.year=1990;
	}
	Car(String makerName){
		this.color="white";
		this.maxSpeed=240;
		this.speed=0;
		this.model="";
		this.maker=makerName;
		this.year=1990;
	}
	Car(String strColor, int maxSpeed, int speed, String model, String maker, int year){
		this.color=strColor;
		this.maxSpeed=maxSpeed;
		this.speed=speed;
		this.model=model;
		this.maker=maker;
		this.year=year;
	}
	// 기능 -> 함수(메소드)	멤버함수[C++] Member function
	public String getColor() { 	// face
		return this.color;		// body
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSpeed() {
		return speed;
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
	// 기능 -> 함수(메소드)	 멤버함수
	void stop(){
		this.setSpeed(0);
		System.out.println(this.model+" 정지합니다.");
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	void drive(int n){
		this.setSpeed(n);
		System.out.println(this.model+" 현재속도 "+this.speed+"km.");
	}
	void turnLeft() {
		System.out.println(this.model+" 좌회전");
	}
	void turnRight() {
		System.out.println(this.model+" 우회전");
	}
}
