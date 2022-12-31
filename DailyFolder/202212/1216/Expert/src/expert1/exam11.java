package expert1;

public class exam11 {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		
		for(int i=0; i<arr1.length; i++) {
			int temp = arr1[i];
			System.out.println(temp);
		}
//		향상된 for문
		for(int temp : arr1) {
			System.out.println(temp);
		}
//		2차배열 향상된 for문
		int[][] lotto = new int[3][3];
		for(int[] temp : lotto) {
			for(int tmp : temp) {
				
			}
		}
		
		Season nov = null;
		nov = Season.FALL;
		if(nov == Season.FALL) {
			System.out.println("가을입니다.");
		}
		
	}

}
