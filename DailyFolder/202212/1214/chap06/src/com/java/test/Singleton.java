package com.java.test;

public class Singleton {

	
//	남들이 사용할 수 있도록 static 변수로 제공
//	남들이 null로 변경하지 못하게 private 처리
	private static Singleton singleton = new Singleton();
	
//	남들이 생성하지 못하게 private처리
	private Singleton(){
		
	}
	
//	void test() {
//		new Singleton();
//	}
	
//	남들이 사용할 수 있게
//	리턴타입 : Singleton 클래스
//	전달인자 없음
//	메소드명 : getInstance
	
	static Singleton getInstance() {
		return singleton;
	}
	
	
}
