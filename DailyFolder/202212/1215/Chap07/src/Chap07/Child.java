package Chap07;

public class Child extends Parent {

	int studentNo;
	
	Child(){
//		super();  // �θ� ���� ����ȴ�. ���� ����
		super("�θ�"); // �θ�����ڿ� �������ڰ� ���� ��츸 ������ ����
		System.out.println("�ڽ� ������ ����");
	}
	
	void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
	void testParent() {
		String name1 = getName();
		System.out.println("name1 : " + name1);
		System.out.println("name : " + this.name);
		System.out.println("this.name : " + this.name);
		System.out.println("super.name : " + super.name);
	}
	
	@Override
	String getName() {
		super.getName();
		return name + "��";
	}
	
	
}
