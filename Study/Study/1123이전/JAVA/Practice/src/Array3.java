public class Array3 {

	public static void main(String[] args) {

		int[] arr = {9,3,2,4,1,0,6,7,8,5}; 
		
		System.out.println("before sorting:");
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
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
		for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+ " ");
		}
			
	}
}