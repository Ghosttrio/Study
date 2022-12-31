package expert1;

public class exam5 {

	public static void main(String[] args) {
		int c[] = new int[6];
		for(int i=0; i<c.length; i++) {
			double a = Math.random();
			int b = (int)((44*a)+1);
			c[i]=b;
			for(int j=0; j<i; j++) {
				if(c[i]==c[j]) {
					i--;
					break;
				}
			}
			System.out.println(c[i]);	
		}
	}
}




// 로또번호 생성기 , 1~45, 중복 x , 6자리 
