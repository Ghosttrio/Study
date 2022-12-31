package com.java.test;

public class SingletonTest {

	public static void main(String[] args) {

//		Singleton.singleton = null;
		
//		Singleton singleton = Singleton.singleton;
			
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		
		boolean tf = (singleton==singleton2);
		System.out.println(tf);
	}

}
