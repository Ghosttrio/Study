package com.shop.meat;

import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Menu menu = new Menu();
		System.out.println("입력할 메뉴 개수를 입력하시오: ");
		for(int i=0; i<s2.nextInt(); i++) {
			System.out.print("메뉴를 입력하시오: ");
			menu.name = s1.nextLine();
			System.out.print("가격을 입력하시오: ");
			menu.price = s2.nextInt();
			System.out.print("먹는 방법을 입력하시오: ");
			menu.setManual(s1.nextLine());
			String eat = menu.eat();
			System.out.println(menu.name + "을 " + eat +" " + menu.price+"원 어치를 먹는다.");
		}
		
		
		Menu[] menu1 = new Menu[] {};
		
		
	}

}
