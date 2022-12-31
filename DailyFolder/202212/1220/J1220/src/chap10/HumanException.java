package chap10;

public class HumanException extends Exception {
	
	HumanException() {
		System.out.println("HumanException 기본 생성자");
	}

	HumanException(String message) {
		super(message);
		System.out.println("String 생성자");
	}
}
