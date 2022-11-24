import java.util.Scanner;


public class Test6 {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		
		int A = a.nextInt();
		int B = a.nextInt();
		int aa = A*(B%10);
		int bb = A*((B%100)-(B%10))/10;
		int cc = A*((B%1000)-(B%100))/100;
		System.out.println(aa);
		System.out.println(bb);
		System.out.println(cc);
		System.out.println(aa+(bb*10)+(cc*100));
	}

}
