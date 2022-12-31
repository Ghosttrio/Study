
public class Reservation {

	int[] book;
	
	Reservation(){
		book = new int[12];
	}
	
	void booking(int a) {
		if(a<=0) {
			System.out.println("다시 입력하시오");
			return;
		}
		if(book[a+1]==0) {
			book[a+1]=a;
			System.out.println("["+a + "번 좌석을 예약합니다.]");
		} else if(book[a+1]!=0) {
			System.out.println(a + "번 좌석은 이미 예약된 자리입니다.");
		}
	}
	
	void view() {
		System.out.println("");
		System.out.println("-------------예약좌석목록--------------");
		for(int i=0; i<12; i++) {
			if(book[i]!=0) {
				System.out.print("["+book[i] + "번] ");
			}
		}
		System.out.println("");
		System.out.println("-----------------------------------");
	}
}
