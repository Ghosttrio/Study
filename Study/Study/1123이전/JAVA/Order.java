
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
	
// ▽초기화-----------------------------------------------------
	
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
	
// ▽주문추가-----------------------------------------------------------
	
	void add() {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		while(true) {
			System.out.print("메뉴번호를 입력하시오: ");
			String n = s1.nextLine();
			if(n.equals("")) break;
			int b =Integer.parseInt(n);
			System.out.println(b + "번 메뉴)  " + m1.alName.get(b) + ":" + m1.alPrice.get(b)+"원");
		
			System.out.print("주문수량을 입력하시오: ");
			int m = s2.nextInt();
			int a = m1.alPrice.get(b);
			int all = a*m;
			
			System.out.println(b+"번 메뉴의 총 가격 : "+all+"원");
			this.alName.add(m1.alName.get(b));
			this.alPrice.add(all);
		}	
	}
	
// ▽주문표시-----------------------------------------------------------------
	
	void display() {
		int sum = 0;
		for(int i=0; i< this.alName.size(); i++) {
			System.out.println("\""+this.alName.get(i)+"\"" + "의 매출 : " + this.alPrice.get(i)+ "원");
			sum += this.alPrice.get(i);
		}
		System.out.println("총 매출: "+sum+"원");
	}
	
// ▽주문메뉴초기화------------------------------------------------------------------------------
	void reset() {
		m1.alName1 = alName;
		m1.alPrice1 = alPrice;
	}

}
