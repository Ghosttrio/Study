import java.util.Scanner;

public class ReservationTest {

	public static void main(String[] args) {
		Reservation reservation = new Reservation();
		Scanner s = new Scanner(System.in);
		
		System.out.print("예약할 좌석의 수를 입력하시오(1~10): ");
		int b = s.nextInt();
		for(int i=0; i<1; i++) {
			if(b>0 && b<11) {
				break;
			} else {
				System.out.println("다시 입력하시오(1~10)");
				i--;
			}
			b = s.nextInt();
		}

		System.out.print("예약할 좌석을 입력하시오(1~10): ");
		for(int i=0; i<b; i++) {
			int a = s.nextInt();
			if(a<1 || a>10) {
				System.out.println("다시 입력하시오(1~10)");
				i--;
			} else {
				reservation.booking(a);	
			}
		}
		reservation.view();
		s.close();
	}

}
