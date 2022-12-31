
public class Student {
	private String name;
	private int birthday;
	private String gender; // 성별
	private String className;
	
	// 생성자 만들기
	// 1. 성별 -> 기본값: 여성
	// 2. 생일 -> 기본값: 1231
	// 3. 모든 필드값을 직접 입력하는 생성자.
	Student(String gender){
		
	}
	Student(int birthday){
		
	}
	Student(){
		
	}
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
	
	// Generate getters and setters
	
}
