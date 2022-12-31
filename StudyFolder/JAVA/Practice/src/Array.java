import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] math = new int[10];
		int sum = 0;
		for(int i=0; i<math.length; i++) {
			math[i]=s.nextInt();
			sum=sum+math[i];
		}
		float avg = sum/math.length;
		System.out.println(avg);
		
	}

}
