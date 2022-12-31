import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {

		Account account = new Account();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.print("금액을 입력하시오: ");
			account.setBalance(s.nextInt());
			System.out.println("현재 잔고: " + account.getBalance());
		}
		
	}

}
