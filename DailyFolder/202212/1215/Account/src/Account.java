
public class Account {

	int balance;
	
	Account(){
		this.balance = 0;
	}
	
	void setBalance(int balance) {
		if(balance >=0 && balance <=1000000) {
			this.balance += balance;
		} else {
			System.out.println("입금불가");
		}
	}
	
	int getBalance() {
		return balance;
	}
	
}
