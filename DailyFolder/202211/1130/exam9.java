package expert1;

public class exam9 {

	public static void main(String[] args) {
//		문제 1
//		한명 추가
//		1,2,3,4,5를 가지는 배열을 만든다.
		
//		문제 2
//		2번지에 추가
//		1,2,5,3,4
		
		int[] memberNo = new int[4];
		memberNo[0] = 1;
		memberNo[1] = 2;
		memberNo[2] = 3;
		memberNo[3] = 4;
	
		
		
		int[] a = new int[5];
		for(int i=0; i<memberNo.length;i++) {
			if(i==2) {
				a[2] = 5;
			} else if(i<2) {
				a[i] = memberNo[i];
			} else if (i>2) {
				a[i] = memberNo[i-1];
			}			
		}
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		
//		for(int i=0; i<memberNo.length; i++) {
//			a[i]=memberNo[i];
//			
//		}
//		a[4] = 5;
		
		
		
//		System.out.println(a[i]);
//		
		
	}

}
