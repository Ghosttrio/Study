package Chap07.drama;

public class DramaTest {

	public static void main(String[] args) {

//		int a = 10;
//		int b = 20;
//		b = a;
//		Drama1 drama1 = new Drama1();
//		Drama1 drama1_1 = new Drama1();
//		Drama drama = drama1;
//		
//		drama1 = drama1_1;
		
//		if ( drama instanceof Drama1) {
//			drama1_1 = (Drama1)drama;
//		}
		
		
		
//		��󸶸� ��û�ϴ� �޼ҵ�
//		�������� : Drama�� ��ӹ��� Ŭ����
//		��� : �� �ȿ��� sick, revenge ���� ����
		
		DramaA dramaA = new DramaA("���� ����");
		dramaA.checkSick("����", 9);
		dramaA.checkBirth("ȫ�浿", "ȫ�浿");
		dramaA.checkRevenge(10);
		dramaA.checkTri(10);
	
	}
	static void watchDrama(Drama drama) {
		String t = drama.getTitle();
		System.out.println(t);
		drama.revenge(2);
	}

}
