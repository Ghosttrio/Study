package com.shop.meat;

import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		Menu menu = new Menu();
		System.out.println("�Է��� �޴� ������ �Է��Ͻÿ�: ");
		for(int i=0; i<s2.nextInt(); i++) {
			System.out.print("�޴��� �Է��Ͻÿ�: ");
			menu.name = s1.nextLine();
			System.out.print("������ �Է��Ͻÿ�: ");
			menu.price = s2.nextInt();
			System.out.print("�Դ� ����� �Է��Ͻÿ�: ");
			menu.setManual(s1.nextLine());
			String eat = menu.eat();
			System.out.println(menu.name + "�� " + eat +" " + menu.price+"�� ��ġ�� �Դ´�.");
		}
		
		
		Menu[] menu1 = new Menu[] {};
		
		
	}

}
