public class Array2 {

	public static void main(String[] args) {

		int[] arr = {9,3,2,4,1,0,6,7,8,5}; 
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr.length; j++) {
	
				if(arr[i]<arr[j]) {
					int[] b = new int[arr.length+1];
					b[i]=arr[i];
					arr[i]=arr[j];
					arr[j]=b[i];				
				}
				
				if(i==arr.length-1) {
				System.out.print(arr[j]+" ");
				}
				
			}
		}
	}
}