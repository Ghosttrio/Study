package Chap07.shop.coffee;

public class PaikCoffee extends CoffeeShop {

	PaikCoffee(){
		super();
		System.out.println("����� ���ٹ��Դϴ�");
	}
	
	void saleMisu() {
		System.out.println("�̼����縦 �Ǹ��մϴ�.");
	}
	
	@Override
	void makePrice(String kind) {
		this.price = kind.length() * 800;
	}
	
	@Override
	void makeCoffee() {
		System.out.println("�޴��� " + this.kind + " Ŀ�Ǹ� ����ϴ�.");
	}
	
}
