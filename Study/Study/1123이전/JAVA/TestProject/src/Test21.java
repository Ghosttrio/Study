import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int [] arr = new int [s.nextInt()];
		
		for(int i=0; i<=arr.length; i++) {
			int j;
			for(j=2; j<arr.length; j++) {
				if(i%j==0) break;
			}
			if(j==i) {
				arr[i]=j;
				System.out.println(arr[i]);
			}
		}
	}
}