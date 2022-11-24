// 4~8까지만 출력 continue 이용
public class Test13 {

	public static void main(String[] args) {
		
		for(int i=0; i<10; i++) {
			if(i<=3 || i>=9) {
				continue;
			} 
			System.out.println(i);
		}
	}
}
