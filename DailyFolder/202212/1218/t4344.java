import java.util.Scanner;
 
public class t4344 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int c = s.nextInt();
		int[] arr;
		
		for(int i=0; i<c; i++) {
			int n = s.nextInt();
			arr = new int[n];
			double sum = 0;
			for(int j=0; j<n ;j++) {
				arr[j] = s.nextInt();
				sum += arr[j];
			}
			double d = 0;
			
			for(int j=0; j<n ;j++) {
				if(arr[j] > (sum/n)) {
					d++;
				}
			}
			
			System.out.printf("%.3f%%\n",(d/n)*100);
		}
		
	}
	
}



//
//출력
//각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
//
//예제 입력 1 
//5
//5 50 50 70 80 100
//7 100 95 90 80 70 60 50
//3 70 90 80
//3 70 90 81
//9 100 99 98 97 96 95 94 93 91