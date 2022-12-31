package com.shop.meat;

public class Menu {

	String name;
	int price;
	String manual = "맛있게 먹는다.";
	
//	기능 : 먹는 방법
	String eat() {
		return manual;
	}
	
//	기능 : manual의 내용을 변경
	void setManual(String manual) {
		this.manual = manual;
	}
	
}
