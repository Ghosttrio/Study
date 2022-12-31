package expert1;

import java.util.Arrays;

public class exam10 {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);
		
		arr1[1] = 200;
		System.out.println(arr2[1]);
		
	}

}
