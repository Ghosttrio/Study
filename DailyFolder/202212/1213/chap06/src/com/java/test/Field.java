package com.java.test;

public class Field {

	int a = 1;
	int b = 2;
	String name = "박창순";
//	필드는 선언을 할 수 있고 초기화도 가능하다.
//	a=4; 안된다. , 선언과 동시에 초기화만 가능하고 실행문은 class에서 입력 불가
//	재할당 등은 실행블럭에서 수행
	
	int test(int a, int b) {
		int result = a+b;
		return result;
	}
//	리턴타입이 void일 경우 return이 생략
	
}
