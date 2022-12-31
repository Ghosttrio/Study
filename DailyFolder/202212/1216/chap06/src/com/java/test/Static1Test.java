package com.java.test;

public class Static1Test {

	public static void main(String[] args) {

		Static1 s1 = new Static1();
		Static1 s2 = new Static1();
		
		System.out.println(s1.b);
		System.out.println(s2.b);
		s1.b = 30;
		System.out.println(s1.b);
		System.out.println(s2.b);
		
		System.out.println(s1.a);
		s1.a=100;
		System.out.println(s2.a);
		
		Static1.a = 100;
//		static은 모든 클래스가 공유한다.
		
		Static1.test1();
//		Static1.test2();
		
	}

}
