package com.shop.meat;

import java.util.Scanner;

public class MenuTest {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		
		
		Menu menu = new Menu();
		Review review = new Review(menu);
//		��������
		System.out.print("�޴��� �Է��Ͻÿ�: ");
		menu.name = s1.nextLine();
		System.out.print("������ �Է��Ͻÿ�: ");
		menu.price = s2.nextInt();
		System.out.print("�Դ� ����� �Է��Ͻÿ�: ");
		menu.setManual(s1.nextLine());
		System.out.println("������ ���並 �Է��Ͻÿ�: ");
		review.setShow(s2.nextInt(),s1.nextLine());
		String eat = menu.eat();
		System.out.println("");
		System.out.println("------------------����-------------------");
		System.out.println("�ֹ�����: " + menu.name + "�� " + eat +" " + menu.price+"�� ��ġ�� �ֹ��ϼ̽��ϴ�.");
		review.show();
		System.out.println("----------------------------------------");
	
		
		
		
		
//		Menu menuTemp = new Menu("asd");
//		Menu menu3 = menu1.initMenu(menuTemp);
		
//		Menu[] menu1 = new Menu[7];
//		menu1[0] = menu1;
//		menu1[1] = menu2;
//		menu1[2] = new Menu();
//		menu1[2].name = "������";
		
		
		
		
		
	}

}
