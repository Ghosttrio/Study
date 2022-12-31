import java.util.Scanner;
 
public class Test2480 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a==b&&b==c&&c==a) {
			System.out.println(10000+a*1000);
		} else if(a==b&b==c){
			System.out.println(1000+b*100);
		} else if(a==c) {
			System.out.println(1000+a*100);
		} else {
			System.out.println(Math.max(Math.max(a, b),c)*100);
		}
		
	}
}