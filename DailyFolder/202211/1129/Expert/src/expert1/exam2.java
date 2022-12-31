package expert1;

import java.util.Scanner;

public class exam2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int n_50000 = n / 50000;
		System.out.println("5만원 : " + n_50000);
		n = n % 50000;
		int n_10000 = n / 10000;
		System.out.println("1만원 : " + n_10000);
		n = n % 10000;
		int n_5000 = n / 5000;
		System.out.println("5천원 : " + n_5000);
		n = n % 5000;
		int n_1000 = n / 1000;
		System.out.println("1천원 : " + n_1000);
		n = n % 1000;
		int n_500 = n / 500;
		System.out.println("5백원 : " + n_500);
		n = n % 500;
		int n_100 = n / 100;
		System.out.println("1백원 : " + n_100);
		n = n % 100;
		int n_10 = n / 10;
		System.out.println("1십원 : " + n_10);

	}

}
