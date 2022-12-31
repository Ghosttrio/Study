package com.shop.meat;

public class Menu {

	String name;
	int price;
//	price = 100; <--이런식은 안된다
//	왜냐하면 이것은 실행문이다.
//	메소드안 제외하고 클래스에서는 실행문 입력 불가
	String manual = "맛있게 먹는다.";
	
//	기능 : 먹는 방법
	String eat() {
		return manual;
	}
	
//	기능 : manual의 내용을 변경
	void setManual(String manual) {
		this.manual = manual;
	}
	
//	Menu initMenu(Menu menu) {
//		menu.name = "기본메뉴";
//		menu.price = 100;
//		return menu;
//	}
	

	int ifTest(int a) {
		int result = -1;
		if(a > 10) {
			result = 10;
		} else {
			result = 0;
		}
		return result;
	}
	
	
}
