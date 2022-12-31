package com.java.test;

public class FieldTest {

	public static void main(String[] args) {

		int[] d =new int[3];
		int[] f =new int[3];
		int[] e = d; 
		
		
		Field a = new Field();
		Field a2 = new Field();
		
		System.out.println(a.name);
		System.out.println(a.a);
		a.a = 20;
		System.out.println(a.a);
		System.out.println(a2.a);
		System.out.println(a.test(1,2));
		

	}

}
