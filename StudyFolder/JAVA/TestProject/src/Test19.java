import java.util.Scanner;

public class Test19 {

	public static void main(String[] args) {
		
		Scanner p = new Scanner(System.in);
		String x = "����";
		String m = "�޴�����";
		String o = "�ֹ�����";
		String s = "�������";
		
		while(true) {
			String a = p.nextLine();
			
			if(a.equals("m")) {
				System.out.println(m);
			} else if(a.equals("o")) {
				System.out.println(o);
			} else if(a.equals("s")) {
				System.out.println(s);
			} else if(a.equals("x")) {
				System.out.println(x);
				break;
			}
			
		}	System.out.println("���α׷� ����");
	
	}

}