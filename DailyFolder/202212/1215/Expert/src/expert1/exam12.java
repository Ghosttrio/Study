package expert1;

import java.util.Scanner;

public class exam12 {

	public static void main(String[] args) {
		//5����, 1����, 5õ��, 1õ��, 500��, 100��, 10�� ǥ��
		int[] arr = new int[] {50000, 10000, 5000, 1000, 500, 100, 10};
		int[] arr1 = new int[7];
		
		Scanner s = new Scanner(System.in);
		System.out.print("�ݾ��� �Է��Ͻÿ�: ");
		int a = s.nextInt(); //765432 
		for(int i=0; i<arr.length; i++) {
			arr1[i] = a / arr[i];
			if(arr[i]>=1000) {
				System.out.println(arr[i]+"��: " + arr1[i] + "��");
			} else {
				System.out.println(arr[i]+"��: " + arr1[i] + "��");
			}
			a = a % arr[i];
		}
	
	}

}
