package expert1;

import java.util.Scanner;

public class exam18 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a[] = {"Rock", "Scissor", "Paper"};
		String com="";
		String human="";
		System.out.println("0) Rock");
		System.out.println("1) Scissor");
		System.out.println("2) Paper");
		System.out.print("Select Number : ");
		
		int b = s.nextInt();
		for(int k=0; k<1; k++) {
			human = a[b];
			System.out.println();
			System.out.println("Human : " + human);
		}
		
		for(int j=0; j<1; j++) {
			double d = Math.random()*3;
			int c = (int)d;
			com = a[c];
			System.out.println("Computer : " + com);
		}
		
		
		System.out.println();
		System.out.println("--Result---------");
		System.out.println();
		
		if(com.equals(human)) {
			System.out.println("Draw");
		} else if(com.equals("Rock")&&human.equals("Scissor")){
			System.out.println("Computer's win!!");
		} else if(com.equals("Rock")&&human.equals("Paper")) {
			System.out.println("Human's win!!");
		} else if(com.equals("Scissor")&&human.equals("Paper")) {
			System.out.println("Computer's win!!");
		} else if(com.equals("Scissor")&&human.equals("Rock")) {
			System.out.println("Human's win!!");
		} else if(com.equals("Paper")&&human.equals("Rock")) {
			System.out.println("Computer's win!!");
		} else if(com.equals("Paper")&&human.equals("Scissor")) {
				System.out.println("Human's win!!");
		}

	}
	
	
}
