
public class Reservation {

	int[] book;
	
	Reservation(){
		book = new int[12];
	}
	
	void booking(int a) {
		if(a<=0) {
			System.out.println("�ٽ� �Է��Ͻÿ�");
			return;
		}
		if(book[a+1]==0) {
			book[a+1]=a;
			System.out.println("["+a + "�� �¼��� �����մϴ�.]");
		} else if(book[a+1]!=0) {
			System.out.println(a + "�� �¼��� �̹� ����� �ڸ��Դϴ�.");
		}
	}
	
	void view() {
		System.out.println("");
		System.out.println("-------------�����¼����--------------");
		for(int i=0; i<12; i++) {
			if(book[i]!=0) {
				System.out.print("["+book[i] + "��] ");
			}
		}
		System.out.println("");
		System.out.println("-----------------------------------");
	}
}
