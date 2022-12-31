package expert1;

import java.util.Scanner;

public class exam17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = i+1;
		}

		for(int i=0; i<a.length;i++) {
			b[a.length-(i+1)]=a[i];
		}
		
//		for(int i=2, j=0; i>=0; i--, j++) {
//			b[j]=a[i];
//		}
//		
		for(int i=0; i<a.length; i++) {
			System.out.println(b[i]);
		}

		
		
		
		
		
		
	}

}
