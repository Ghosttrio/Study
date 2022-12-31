package expert1;

public class exam8 {

	public static void main(String[] args) {
		
		int[] d = new int[4];
		d[0] = 10;
		d[1] = 20;
		d[2] = 30;
		d[3] = 40;
		
		int[] e = new int[4];
		
//		얕은복사, thin clone, shallow copy, call by reference, 원본이 바뀌는 것
//		e=d;
		
//		깊은복사, deep clone, deep copy, call by value, 새로운 곳에다가 넣어주는 것
		for(int i=0; i<d.length; i++) {
			e[i] = d[i];
		}
		
		System.out.println(e[2]);

		System.out.println(d[0]);
		test(d);
		System.out.println(d[0]);
	}
	static void test(int[] a) {
		a[0] = 20;
	}
}