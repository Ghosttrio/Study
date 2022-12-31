package exam;

public class Exam19 {

//	잔고 필드
	int balance;
	
	Exam19(){
		this.balance = 1000;
	}
	
//	잔고는 음수는 허용하지 않음
//	최대 100만원까지만 허용

//	getter, setter을 이용해서 잔고를 직접 변경
//	상수
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
//	ctrl shift x 대문자로바꾸기
//	ctrl shift y 대문자로바꾸기	
//	set할때 음수거나 백만원이 넘는 경우 잔고 유지
	
//	getter
//	메소드명 : getBalance
//	기능 : 필드 balance를 반환
//	전달인자 : 없음
//	리턴타입 : int
	
	int getBalance() {
		return this.balance;
	}
	
//	setter
//	메소드명 : setBalance
//	기능 : 조건이 맞는 경우 잔고를 변경
//	잔고는 음수를 허용하지 않음
//	최대 100만원까지만 허용
//	set할때 음수거나 백만원이 넘는 경우 잔고 유지
//	전달인자 : int
//	리턴타임 : 없음
	
	void setBalance(int balance) {
		if(balance>=MIN_BALANCE && balance<=MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
}
