package Chap07.shop.coffee;

public class CoffeeShop {
	
	int price;
	String kind; // Ŀ������ 
	
	CoffeeShop(){
		this.price = 0;
		this.kind = "";
	}

// 	������ �����ؼ� �ֹ�
//	�������� : Ŀ������ String
	void order(String kind) {
		this.kind = kind; // Ŀ����������
		makePrice(kind);
		System.out.println(kind + " �ֹ� �޾ҽ��ϴ�.");
		System.out.println(kind + " ������ " + this.price + "�� �Դϴ�.");
	}
//	������ ������ ����
//	�޼ҵ�� : makePrice
//	�������� : Ŀ������
//	��� : Ŀ�������� ���ڼ� * 1000 ����ؼ� �ʵ忡 ����
//	����Ÿ�� : ����
	
	void makePrice(String kind) {
//		�������� ���� �ʵ� this.kind�� ����ص� ��
		this.price = kind.length() * 1000;
	}
	
/*
 * ������ �迭�� �����
 * ������ ������ �ݾ��� ����	
 */
	
// 	�����ϱ�
//	�޼ҵ�� : pay
//	�������� : �����ݾ� (money)
//	��� : ������ �ݾ׿� ���� Ŀ�� ���� ���θ� �Ǵ�
//	����Ÿ�� : void
	void pay(int money) {
		if(this.price <= money) {
//			Ŀ������
		} else {
			System.out.println("�ݾ��� ���ڶ��ϴ�.");
		}
	}
	
//	Ŀ������
//	�޼ҵ�� : service
	void service() {
		makeCoffee();
		System.out.println("�ֹ��Ͻ� " + this.kind + " Ŀ�� ���Խ��ϴ�");
	}
	
//	Ŀ�� �����
//	�޼ҵ�� : makeCoffee()
//	�������� : ����
//	��� : �ʵ��� ������ �ش��ϴ� Ŀ�Ǹ� �����
//	����Ÿ�� : ����
	void makeCoffee() {
		System.out.println(this.kind + "Ŀ�Ǹ� ����ϴ�.");
	}
	
}
