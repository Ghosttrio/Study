package Chap07.shop.coffee;

public class PaikCoffee extends CoffeeShop {

	PaikCoffee(){
		super();
		System.out.println("여기는 빽다방입니다");
	}
	
	void saleMisu() {
		System.out.println("미숫가루를 판매합니다.");
	}
	
	@Override
	void makePrice(String kind) {
		this.price = kind.length() * 800;
	}
	
	@Override
	void makeCoffee() {
		System.out.println("달달한 " + this.kind + " 커피를 만듭니다.");
	}
	
}
