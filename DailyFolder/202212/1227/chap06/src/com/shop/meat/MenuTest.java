package com.shop.meat;

import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		
		
		Menu menu = new Menu();
		Review review = new Review(menu);
//		얕은복사
		System.out.print("메뉴를 입력하시오: ");
		menu.name = s1.nextLine();
		System.out.print("가격을 입력하시오: ");
		menu.price = s2.nextInt();
		System.out.print("먹는 방법을 입력하시오: ");
		menu.setManual(s1.nextLine());
		System.out.println("별점과 리뷰를 입력하시오: ");
		review.setShow(s2.nextInt(),s1.nextLine());
		String eat = menu.eat();
		System.out.println("");
		System.out.println("------------------리뷰-------------------");
		System.out.println("주문내용: " + menu.name + "을 " + eat +" " + menu.price+"원 어치를 주문하셨습니다.");
		review.show();
		System.out.println("----------------------------------------");
	
		
		
		
		
//		Menu menuTemp = new Menu("asd");
//		Menu menu3 = menu1.initMenu(menuTemp);
		
//		Menu[] menu1 = new Menu[7];
//		menu1[0] = menu1;
//		menu1[1] = menu2;
//		menu1[2] = new Menu();
//		menu1[2].name = "껍떼기";
		
		
		
		
		
	}

}
