
//Arrays.sort()

//이 메소드는 배열에 저장된 원소 값을 오름차순으로 정렬해주는 메소드다.
//
//이 메소드를 활용하여 정렬하면 최솟값은 배열의 첫번째 원소(index 0)에, 
//최댓값은 배열의 마지막 원소(arr.length-1)에 있을테니 이를 출력하면 된다.


import java.util.Scanner;
import java.util.Arrays;

public class t10818{
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		
		int[] a = new int[N];
		
		for(int i=0; i<a.length; i++) {
			
			a[i] = s.nextInt();
			
		}
		
	
		Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);
		
	}
	
}

//문제
//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//입력
//첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 
//둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 
//모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//출력
//첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.