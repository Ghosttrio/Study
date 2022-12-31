
public class Function1 {
	//함수(function) 반복되는 코드의 모음
	static void showArray(int[] arp) {
		for(int i=0; i<arp.length; i++) {
			System.out.print(arp[i]+ " ");
		}
	}
	public static void main(String[] args) {
		int[] arr = {9,3,2,4,1,0,6,7,8,5}; 
		
		System.out.println("before sorting:");
		showArray(arr);// 함수호출
		System.out.println("");
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;				
				}
			}	
		}
		System.out.println("after sorting");
		showArray(arr);
	}
		
}

