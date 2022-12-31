package Chap07.shop.coffee;

public class CoffeeShop {
	
	int price;
	String kind; // 커피종류 
	
	CoffeeShop(){
		this.price = 0;
		this.kind = "";
	}

// 	종류를 지정해서 주문
//	전달인자 : 커피종류 String
	void order(String kind) {
		this.kind = kind; // 커피종류저장
		makePrice(kind);
		System.out.println(kind + " 주문 받았습니다.");
		System.out.println(kind + " 가격은 " + this.price + "원 입니다.");
	}
//	선택한 종류의 가격
//	메소드명 : makePrice
//	전달인자 : 커피종류
//	기능 : 커피종류의 글자수 * 1000 계산해서 필드에 저장
//	리턴타입 : 없음
	
	void makePrice(String kind) {
//		전달인자 없이 필드 this.kind를 사용해도 됨
		this.price = kind.length() * 1000;
	}
	
/*
 * 종류를 배열로 만들고
 * 동일한 순서로 금액을 지정	
 */
	
// 	결제하기
//	메소드명 : pay
//	전달인자 : 결제금액 (money)
//	기능 : 결제한 금액에 따라 커피 제공 여부를 판단
//	리턴타입 : void
	void pay(int money) {
		if(this.price <= money) {
//			커피제공
		} else {
			System.out.println("금액이 모자랍니다.");
		}
	}
	
//	커피제공
//	메소드명 : service
	void service() {
		makeCoffee();
		System.out.println("주문하신 " + this.kind + " 커피 나왔습니다");
	}
	
//	커피 만들기
//	메소드명 : makeCoffee()
//	전달인자 : 없음
//	기능 : 필드의 종류에 해당하는 커피를 만든다
//	리턴타입 : 없음
	void makeCoffee() {
		System.out.println(this.kind + "커피를 만듭니다.");
	}
	
}
