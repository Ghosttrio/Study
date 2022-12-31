
package expert1;

public class exam7 {

	public static void main(String[] args) {

		String a = "*";

		for(int i=0; i<5; i++) {
			System.out.print(a);
		}
	
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(a);
			}
			System.out.println();
		}

		for(int i=1; i<6; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(a);
			}
			System.out.println();
		}
	
		for(int i=0; i<5; i++) {
			for(int j=9; j>i+5; j--) {
				System.out.print(" ");
			}
			for(int k=0; k<=2*i; k++) {
				System.out.print(a);
			}
			System.out.println();
		}
		
//		for문 2개로도 가능
		
		
		
	}
	
}
