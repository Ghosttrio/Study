import java.util.Scanner;

public class ReservationTest {

	public static void main(String[] args) {
		Reservation reservation = new Reservation();
		Scanner s = new Scanner(System.in);
		
		System.out.print("������ �¼��� ���� �Է��Ͻÿ�(1~10): ");
		int b = s.nextInt();
		for(int i=0; i<1; i++) {
			if(b>0 && b<11) {
				break;
			} else {
				System.out.println("�ٽ� �Է��Ͻÿ�(1~10)");
				i--;
			}
			b = s.nextInt();
		}

		System.out.print("������ �¼��� �Է��Ͻÿ�(1~10): ");
		for(int i=0; i<b; i++) {
			int a = s.nextInt();
			if(a<1 || a>10) {
				System.out.println("�ٽ� �Է��Ͻÿ�(1~10)");
				i--;
			} else {
				reservation.booking(a);	
			}
		}
		reservation.view();
		s.close();
	}

}
