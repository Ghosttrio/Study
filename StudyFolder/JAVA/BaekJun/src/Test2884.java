import java.util.Scanner;

public class Test2884 {

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		int H = s.nextInt();
		int M = s.nextInt();

		if(H>0 && M<45) {
			System.out.println(H-1);
			System.out.println(M+15);
		
		} else if(M>=45) {
			System.out.println(H);
			System.out.println(M-45);
		} else if(H==0 && M<45) {
			System.out.println(23);
			System.out.println(M+15);
		}
	}
}

