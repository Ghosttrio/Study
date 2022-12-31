import java.util.Scanner;



public class t8958{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String[] arr = new String[s.nextInt()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = s.nextLine();
		}
		
		s.close();
		
		for(int i=0; i<arr.length; i++) {
			int a = 0;
			int b = 0;
			
			for(int j=0; j<arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') {
					a++;
				} else {
					a = 0;
				}
				b += a;
			}
			System.out.println(b);
		}
		
		
	}
}