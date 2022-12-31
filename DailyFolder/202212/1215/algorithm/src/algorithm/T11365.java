package algorithm;

import java.util.Scanner;

public class T11365 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
//		a b c d e
		
		String[] b = new String[a.length()];
//		index 5 배열
		
		
		
		for(int i=0; i<b.length; i++) {
			b[i] = b[b.length-i];
		}
		
		
	}

}
