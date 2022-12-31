package com.java.test;

public class HelloTest {
	static int b;

	public static void main(String[] args) {
		Hello a = new Hello();
		a = null;
		a = new Hello();
//		위의 객체와 다른 새로 생성되는 객체이다
		a.print();
		System.out.println(b);
	}

}
