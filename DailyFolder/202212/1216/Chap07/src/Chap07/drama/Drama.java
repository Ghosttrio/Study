package Chap07.drama;

public abstract class Drama {

	String title;
	String type; 
	int days;
	
	
	Drama(){
		this.title = "";
	}

	void setTitle(String title){
		this.title = title;
	}
	
	String getTitle(){
		return this.title;
	}
	
	
//	--------------------------------------------------------
//	����
//	�������� : ����, �Ⱓ
//	����Ÿ�� : ���
	abstract String sick(String type, int days);

	void checkSick(String type, int days) {	
//		if(sick(type, days).equals("����") && days < 10) {
//			System.out.println("�׳� �����Դϴ�.");
//		} else {
//			System.out.println("���� ���Դϴ�.");
//		}
		System.out.println(sick(type, days));
	}
	
//	--------------------------------------------------------

//	����� ���
//	�������� : �����θ�, ���ݺθ�
//	����Ÿ�� : ��� ����
	abstract boolean birthInfo(String origin, String now);
	
	void checkBirth(String origin, String now) {
		if(birthInfo(origin, now)) {
			System.out.println("���� �� �ֺ��");
		} else {
			System.out.println("��������?");
		}
	}
	
//	--------------------------------------------------------
//	����
//	�������� : �������� ����
//	����Ÿ�� : �������
	abstract String revenge(int angry);
	
	void checkRevenge(int angry) {
		System.out.println(revenge(angry));
	}

//	--------------------------------------------------------
//	�ﰢ����
//	�������� : �ο� ��
//	����Ÿ�� : ���
	abstract String triangle(int count);
	
	void checkTri(int count) {
		System.out.println(triangle(count));
	}
//	--------------------------------------------------------
}
