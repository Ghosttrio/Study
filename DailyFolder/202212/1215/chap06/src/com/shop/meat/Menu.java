package com.shop.meat;

public class Menu {

	String name;
	int price;
//	price = 100; <--�̷����� �ȵȴ�
//	�ֳ��ϸ� �̰��� ���๮�̴�.
//	�޼ҵ�� �����ϰ� Ŭ���������� ���๮ �Է� �Ұ�
	String manual = "���ְ� �Դ´�.";
	
//	��� : �Դ� ���
	String eat() {
		return manual;
	}
	
//	��� : manual�� ������ ����
	void setManual(String manual) {
		this.manual = manual;
	}
	
//	Menu initMenu(Menu menu) {
//		menu.name = "�⺻�޴�";
//		menu.price = 100;
//		return menu;
//	}
	

	int ifTest(int a) {
		int result = -1;
		if(a > 10) {
			result = 10;
		} else {
			result = 0;
		}
		return result;
	}
	
	
}
