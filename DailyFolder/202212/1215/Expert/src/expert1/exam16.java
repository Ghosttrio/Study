package expert1;

import java.util.Scanner;

public class exam16 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];

		int even = 0;
		int odd =0;
		System.out.println("Number : ");
		for(int i=0; i<arr.length; i++) {
			double b = 10*Math.random();
			arr[i] = (int)b;
			System.out.print(arr[i]+" / ");
			if(arr[i]%2==0) {
				even++;
			} else {
				odd++;
			}
			
		}
		System.out.println();
		System.out.println("even : " + even);
		System.out.println("odd : " + odd);
		
	}

}
