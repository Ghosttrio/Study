
public class Student {
//	final static float pi=3.14f;
	
	private String name;
	private int birthday;
	private String gender;
	private String className;
	
	//생성자만들기
	//1. 성별 -> 기본값: 여성
	//2. 생일 -> 기본값: 1231
	//3. 모든 필드값을 직접 입력하는 생성자.
	
	/*
	Student(String gender){
		this.gender=gender;
		this.birthday=0;
		this.name=this.className="";
	}
	*/
	
	Student(){
		
	}
	
	
	Student(String name, int birthday, String className){
		this.name = name;
		this.birthday = birthday;
		this.gender = "Female";
		this.className = className;
	}
	
	Student(String name, String gender, String className){
		this.name = name;
		this.birthday = 1231;
		this.gender = gender;
		this.className = className;
	}
	
	Student(String name, int birthday, String gender, String className){
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.className = className;
	}
	/*	
  	Student(String a, int b, String c, String d){
		this.name = a;
		this.birthday = b;
		this.gender = c;
		this.className = d;
	}
 	
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	
	
}
