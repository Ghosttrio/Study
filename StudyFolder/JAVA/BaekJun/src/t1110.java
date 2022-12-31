import java.util.Scanner;

public class t1110 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int a = n/10;
		int b = n%10;
		int c = a+b;
		int m = n;
		int i = 0;
		while(true) {
			n=b*10+c%10;
			a=b;
			b=c%10;
			c=a+b;
			i++;
			if(m==n) {
				break;
			}
	
		}System.out.println(i);
		
	}
}

