package Chap07.car;

public class Car {
	
	int speed; // 속도
	int gas; // 기름
	boolean power; //시동
	
	Car(){
		this.gas = 0;
		this.power = false;
	}
	
//	시동
	void boot(int gas, boolean power) {
		this.gas = gas;
		this.power = power;
	}
	
//	전진
	void Drive() {
		System.out.println("전진합니다");
	}
	
//	후진
	void Reverse() {
		System.out.println("후진합니다");
	}
	
//	정지
	void Stop() {
		System.out.println("정지합니다");
	}
	
//	시동여부
	
	
}
