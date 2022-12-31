
public class CalcTest {

	public static void main(String[] args) {

		System.out.println("before");
		Calc calc = new Calc();
		System.out.println("after");
		
		int a = calc.sum(1, 2);
		System.out.println("result: " + a);
		
		
		System.out.println(calc.underBar("-"));
	
//		----------------------------
		
		int b = calc.minus(2, 1);
		int c = calc.multi(2, 1);
		double d = calc.divide(2, 1);
		int e = calc.remain(2, 1);

		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	
		long g2 = 4000000000L;
		int g3 = (int)g2;
		System.out.println(g3);
		
//		--------------------------
		System.out.println(calc.square(1, 2));
		
		calc.printNickname();
		
		
		calc.setNickname("Ralo");
		calc.getNickname();
		
		
		Calc calc1 = new Calc("cal1");
		Calc calc2 = new Calc("cal2");
		calc1.printNickname();
		calc2.printNickname();
	}

}
