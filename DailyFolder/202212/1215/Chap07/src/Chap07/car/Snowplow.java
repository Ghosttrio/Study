package Chap07.car;

public class Snowplow extends Car {

//	속도
//	전진
//	후진
//	멈춰
//	시동여부
//	기름
	
	
//	제설하기
	void snowRemoval() {
		System.out.println("제설합니다");
	}
	
	@Override
	void Drive() {
		System.out.println("제설차가 천천히 전진합니다");
	}
	
}
