
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	ArrayList<String> alName;
	ArrayList<Integer> alQty;
	ArrayList<Integer> alPrice;
	Menu m1;
	
	Order(Menu m){
		this.alName = new ArrayList<String>();
		this.alQty = new ArrayList<Integer>();
		this.alPrice = new ArrayList<Integer>();
		m1 = m;
	}
	
	// 메뉴명, 수량, 단가
	void add() {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		while(true) {
//			System.out.print("0은탈출");
//			int n = s.nextInt();
//			if(n==0) break;
			System.out.print("메뉴번호를 입력하시오: ");
			String n = s1.nextLine();
			if(n.equals("")) break;
			int b =Integer.parseInt(n);
			System.out.println(b + "번메뉴)  " + m1.alName.get(b) + ":" + m1.alPrice.get(b));
		
			System.out.print("주문수량을 입력하시오: ");
			int m = s2.nextInt();

			int a = m1.alPrice.get(b);
			int all = a*m;
			System.out.println(b+"번 메뉴의 총 가격 : "+all+"원");

			System.out.println();
		
		
			this.m1.alName1.add(m1.alName.get(b));
			this.m1.alPrice1.add(all);
		
		}
	
	}
	
	
	
	
	
	void display() {
	
		for(int i=0; i< m1.alName1.size(); i++) {
			System.out.println("\""+m1.alName1.get(i)+"\"" + "의 매출 : " + m1.alPrice1.get(i)+ "원");
		}
		
	}
//	메뉴번호, 수량, 단가
//	void add() {
//		Scanner s = new Scanner(System.in);
//		while(true) {
//			m1.display();
//	System.out.print("0은탈출");
//	int n = s.nextInt();
//	if(n==0) break;
//			System.out.println("메뉴입력하시오");
//			int n = s.nextInt();
//			this.alName.add(m1.alName.get(n-1));
//			System.out.println("수량입력");
//			int qty = s.nextInt();
//			int price = qty*m1.alPrice.get(n-1);
//			System.out.println(price);
//			this.alQty.add(qty);
//			this.alPrice.add(price);
//		}
//	}
	
//	void dispaly() {
//		int sum = 0;
//		for(int i=0; i<this.alName.size(); i++) {
//			System.out.println(this.alName.get(i)+ ", x"+this.alQty.get(i));
//			sum+=this.alPrice.get(i);
//		}
//		System.out.println("총금액: "+sum+"원");
//	}
	
	
	
	void reset() {
		m1.alName1 = alName;
		m1.alPrice1 = alPrice;
	}
}
