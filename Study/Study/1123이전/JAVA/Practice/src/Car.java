
public class Car { // ��Ǫ��
	
	// �Ӽ� -> ����(�ʵ�)	(c++:�������)
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
//		this(makerName); �ȵ�
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
	
	
	
	// ��� -> �Լ�(�޼ҵ�)	(c++:����Լ�)
	void stop(){
//		this.speed = 0;
		this.setSpeed(0); // �Լ����Լ���ȣ��
							// �ߺ��ڵ带 ����
		System.out.println(this.model + " �����մϴ�.");
	}
	void drive(int n){
		speed = n;
		System.out.println(this.model+" ����ӵ� "+speed+"km/h");
	}
	
	int drive() {
		return this.speed;
	}
	//main���� myCar.drive(10)
	//int a = myCar.drive();
	
	
	
	void turnLeft() {
		System.out.println(this.model+" ��ȸ��");
	}
	void turnright() {
		System.out.println(this.model+" ��ȸ��");
	}
	
}