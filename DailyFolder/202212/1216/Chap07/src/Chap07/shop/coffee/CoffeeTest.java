package Chap07.shop.coffee;

import java.util.Scanner;

public class CoffeeTest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		PaikCoffee paik = new PaikCoffee();
		paik.order("���̽� �Ƹ޸�ī��");
		paik.pay(7200);
		
		
		
		Starbucks star = new Starbucks();
		if(s.nextLine().equals("������")) {
			paik.order(star.saleMalchar());
			star.pay(7000);
		} else {
			star.order(s.nextLine());
			star.pay(7000);
		}
		
	
		
		
		
	}

}