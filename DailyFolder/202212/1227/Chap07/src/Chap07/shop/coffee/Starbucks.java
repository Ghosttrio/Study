package Chap07.shop.coffee;

public class Starbucks extends CoffeeShop {

	Starbucks(){
		System.out.println("�ȳ��ϼ��� ��Ÿ�����Դϴ�");
	}
	
	String saleMalchar() {
		String a = "������";
		return a;
	}
	
	@Override
	void makePrice(String kind) {
		this.price = kind.length() * 1500;
	}
	
	@Override
	void makeCoffee() {
		System.out.println(this.kind + " Ŀ�Ǹ� ����ϴ�.");
	}
	
}
