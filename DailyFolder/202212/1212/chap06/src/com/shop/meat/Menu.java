package com.shop.meat;

public class Menu {

	String name;
	int price;
	String manual = "���ְ� �Դ´�.";
	
//	��� : �Դ� ���
	String eat() {
		return manual;
	}
	
//	��� : manual�� ������ ����
	void setManual(String manual) {
		this.manual = manual;
	}
	
}
