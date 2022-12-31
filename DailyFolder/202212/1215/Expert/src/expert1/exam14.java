package expert1;

import java.util.Scanner;

public class exam14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int[] a = new int[s.nextInt()];
		
		for(int i=0; i<a.length; i++) {
			double b = 10*Math.random();
			a[i] = (int)b;
			System.out.print(a[i]+" / ");
		}
		
	}

}
