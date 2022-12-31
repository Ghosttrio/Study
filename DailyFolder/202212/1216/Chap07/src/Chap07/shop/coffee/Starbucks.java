package Chap07.shop.coffee;

public class Starbucks extends CoffeeShop {

	Starbucks(){
		System.out.println("안녕하세요 스타벅스입니다");
	}
	
	String saleMalchar() {
		String a = "말차라떼";
		return a;
	}
	
	@Override
	void makePrice(String kind) {
		this.price = kind.length() * 1500;
	}
	
	@Override
	void makeCoffee() {
		System.out.println(this.kind + " 커피를 만듭니다.");
	}
	
}
