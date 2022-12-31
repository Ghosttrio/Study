package com.shop.meat;

public class Review {

	Menu menu;
	int star;
	String say;
	
	Review(Menu menu){
		this.menu = menu;
		this.star = 0;
		this.say = "";
	}
	
	void setShow(int star, String say) {
		this.star = star;
		this.say = say;
	}
	
	void show(){
		System.out.println("주문메뉴: " + menu.name);
		System.out.println("가격: " + menu.price + "원");
		System.out.println("별점: " + star+"점");
		System.out.println("리뷰: " + say);
	}
	

}
