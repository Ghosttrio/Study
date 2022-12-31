
public class Teen {
	
	public static void main(String[] args) {
		
		Student first = new Student("Jane", 1101, "Spring");
		showFields(first);
		System.out.println("-----------------");
		
		Student second = new Student("John", "Male", "Java");
		showFields(second);
		System.out.println("-----------------");
	
		Student third = new Student("Changsoon", 1111, "Male", "Java&Spring");
		showFields(third);
		
		
//		first.setName("John");
//		first.setBirthday(1024);
//		first.setGender("Male");
//		first.setClassName("Java Programming");
//		
//		System.out.println("Name: "+ first.getName() );
//		System.out.println("Birthday: "+ first.getBirthday() );
//		System.out.println("Gender: "+ first.getGender() );
//		System.out.println("ClassName: "+ first.getClassName() );
//		System.out.println("");
//		
//		second.setName("Jane");
//		second.setBirthday(1111);
//		second.setGender("Female");
//		second.setClassName("Web Publisher");
//		
//		System.out.println("Name: "+ second.getName() );
//		System.out.println("Birthday: "+ second.getBirthday() );
//		System.out.println("Gender: "+ second.getGender() );
//		System.out.println("ClassName: "+ second.getClassName() );
		
	}
	static void showFields(Student person) {
		
		System.out.println(person.getName());
		System.out.println(person.getBirthday());
		System.out.println(person.getGender());
		System.out.println(person.getClassName());
	}
	
}


//문제1
//"John", 10/24, "Male", "Java Programming"
// 세터를 이용해서 셋팅하고 
// System.out.println("name: "+first.getName()); 겟터를 이용해서 출력
//"Jane", 11/11, "Female", "Web Publisher"