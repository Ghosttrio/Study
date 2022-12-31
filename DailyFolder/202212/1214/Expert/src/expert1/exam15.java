package expert1;

import java.util.Scanner;

public class exam15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.print("Enter Number : ");
		int a = s.nextInt();
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			double b = 10*Math.random();
			arr[i] = (int)b;
			System.out.print(arr[i]+" / ");
			if(arr[i]>a) {
				sum++;
			}
			
		}
		System.out.println();
		System.out.println();
		System.out.println("result : " + sum);
		
		
	}

}
