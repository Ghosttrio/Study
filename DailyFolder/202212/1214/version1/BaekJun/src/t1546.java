import java.util.Arrays;
import java.util.Scanner;
public class t1546 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		double a[] = new double[n]; 
				
		for(int i=0; i<a.length; i++) {
			a[i]=s.nextDouble();
		}
		Arrays.sort(a);
		
		double sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += ((a[i]/a[a.length-1])*100);
		}
		System.out.println(sum/n);
		
	}
}
