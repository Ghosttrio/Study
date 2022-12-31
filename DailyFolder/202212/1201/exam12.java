package expert1;

import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {
		//5만원, 1만원, 5천원, 1천원, 500원, 100원, 10원 표현
		int[] arr = new int[] {50000, 10000, 5000, 1000, 500, 100, 10};
		int[] arr1 = new int[7];
		
		Scanner s = new Scanner(System.in);
		System.out.print("금액을 입력하시오: ");
		int a = s.nextInt(); //765432 
		for(int i=0; i<arr.length; i++) {
			arr1[i] = a / arr[i];
			if(arr[i]>=1000) {
				System.out.println(arr[i]+"원: " + arr1[i] + "장");
			} else {
				System.out.println(arr[i]+"원: " + arr1[i] + "개");
			}
			a = a % arr[i];
		}
	
	}

}
