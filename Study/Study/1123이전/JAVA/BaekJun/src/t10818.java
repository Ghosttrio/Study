import java.util.Scanner;

public class t10818 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int[] a = new int[N];		
		
		for(int j=0; j<a.length; j++) {
			a[j] = s.nextInt();
			for(int k=0; k<a.length; k++) {
				
				if(a[j]<a[k]) {
					System.out.print(a[j]);
				}else {
					System.out.println(a[k]);
				}
				
			}
		}
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