package exam;

public class Exam19Test {

	public static void main(String[] args) {

		Exam19 exam19 = new Exam19();
		int money = exam19.getBalance();
		System.out.println("Balance is " + exam19.getBalance() + "WON");
		exam19.setBalance(50000);
		System.out.println("Balance is " + exam19.getBalance() + "WON");
		exam19.setBalance(-1000);
		System.out.println("Balance is " + exam19.getBalance() + "WON");
		exam19.setBalance(2000000);
		System.out.println("Balance is " + exam19.getBalance() + "WON");
	
	
	}

}
