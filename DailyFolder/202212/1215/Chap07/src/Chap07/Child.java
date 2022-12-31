package Chap07;

public class Child extends Parent {

	int studentNo;
	
	Child(){
//		super();  // 부모가 먼저 실행된다. 생략 가능
		super("부모"); // 부모생성자에 전달인자가 없는 경우만 생략이 가능
		System.out.println("자식 생성자 실행");
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
		return name + "님";
	}
	
	
}
